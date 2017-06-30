package com.zjutywc.facadeModel;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}

	public void startup() {
		System.out.println("startup the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("startup over!");
	}

	public void shutdown() {
		System.out.println("shutdown the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("shutdown over!");
	}
}
