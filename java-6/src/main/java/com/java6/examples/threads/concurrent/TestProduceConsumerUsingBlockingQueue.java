package com.java6.examples.threads.concurrent;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.java6.examples.threads.Constants;

public class TestProduceConsumerUsingBlockingQueue {

	public static final String CharacterConstants = null;

	public static void main(String[] args) throws Exception {

		MessageBuffer messageBuffer = new MessageBuffer(Constants.BUFFER_SIZE);

		Producer produce = new Producer(messageBuffer);
		Consumer consumer = new Consumer(messageBuffer);

		produce.start();
		consumer.start();

	}

	static class MessageBuffer {
		int bufferSize;
		private BlockingQueue<String> msgPool;

		public MessageBuffer(int bufferSize) {
			super();
			this.bufferSize = bufferSize;
			msgPool = new LinkedBlockingQueue<String>(bufferSize);
		}

		public int getBufferSize() {
			return bufferSize;
		}

		public void addMessageToBuffer(String msg) throws Exception {
			msgPool.put(msg);
		}

		public String getMessageFromBuffer() throws Exception {
			String msg = (String) msgPool.take();
			return msg;

		}

	}

	static class Producer extends Thread {
		String msg;
		MessageBuffer messageBuffer;

		public Producer(MessageBuffer messagePool) {
			super();
			this.messageBuffer = messagePool;
		}

		public void run() {
			try {
				produceMsg();
			} catch (Exception e) {
				System.out.println(e);
			}
			super.run();
		}

		public void produceMsg() throws Exception {
			for (int i = 0; i < Constants.MESSAGES; i++) {
				msg = i + "";
				System.out.println("produced : " + msg);
				messageBuffer.addMessageToBuffer(msg);
			}
		}
	}

	static class Consumer extends Thread {
		
		MessageBuffer messageBuffer;

		public Consumer(MessageBuffer messageBuffer) {
			super();
			this.messageBuffer = messageBuffer;
		}

		public void run() {
			try {
				consumeMsg();
			} catch (Exception e) {
				e.printStackTrace();
			}
			super.run();
		}

		public void consumeMsg() throws Exception {
			for (int i = 0; i < Constants.MESSAGES; i++) {
				System.out.println("consumed "
						+ messageBuffer.getMessageFromBuffer());
			}
		}
	}
}
