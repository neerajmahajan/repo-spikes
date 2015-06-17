package com.java6.examples.threads.concurrent;


import java.util.ArrayList;

import com.java6.examples.threads.Constants;

public class TestProduceConsumer {
	public static void main(String[] args) throws Exception {

		MessageBuffer messageBuffer = new MessageBuffer(Constants.BUFFER_SIZE);

		Produce produce = new Produce(messageBuffer);
		Consumer consumer = new Consumer(messageBuffer);

		produce.start();
		consumer.start();

	}
}

class MessageBuffer {
	int bufferSize;
	private ArrayList<String> msgBuffer = new ArrayList<String>();

	public MessageBuffer(int bufferSize) {
		super();
		this.bufferSize = bufferSize;
	}

	public int getBufferSize() {
		return bufferSize;
	}

	public synchronized void addMessageToBuffer(String msg) throws Exception {
		if (msgBuffer.size() == bufferSize) {
			wait();
			// throw new Exception("msg pool is full");
		}

		msgBuffer.add(msg);
		notifyAll();
	}

	public synchronized String getMessageFromBuffer() throws Exception {
		String msg = null;
		if (msgBuffer.size() == 0) {
			wait();
			// throw new Exception("msg pool is empty");
		}
		msg = msgBuffer.remove(0);
		notifyAll();
		return msg;

	}

}

/*
 * class Produce { String msg ; MessagePool messagePool;
 * 
 * public Produce(MessagePool messagePool) { super(); this.messagePool =
 * messagePool; }
 * 
 * 
 * public void produceMsg() throws Exception{ for(int i=0;i<10;i++) { msg =
 * i+""; messagePool.addMessageToPool(msg); } } }
 */

class Produce extends Thread {
	String msg;
	MessageBuffer messageBuffer;

	public Produce(MessageBuffer messageBuffer) {
		super();
		this.messageBuffer = messageBuffer;
	}

	@Override
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

/*
 * class Consumer { MessagePool messagePool; public Consumer(MessagePool
 * messagePool) { super(); this.messagePool = messagePool; }
 * 
 * public void consumeMsg() throws Exception { for(int i=0;i<10;i++) {
 * System.out.println(messagePool.getMessageFromPool()); } } }
 */

class Consumer extends Thread {
	MessageBuffer messageBuffer;

	public Consumer(MessageBuffer messagePool) {
		super();
		this.messageBuffer = messagePool;
	}

	@Override
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
			System.out.println("consumed " + messageBuffer.getMessageFromBuffer());
		}
	}
}
