package de.pdbm;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;

import static jdk.incubator.foreign.ValueLayout.JAVA_INT;

import java.lang.invoke.MethodHandle;


/**
 * Runs the C function getpid() and prints result.
 * 
 * @author bernd
 *
 */
public class ProcessId {

	public static void main(String[] args) throws Throwable {

		MethodHandle getpid =  CLinker.systemCLinker().downcallHandle(
				CLinker.systemCLinker().lookup("getpid").get(),
				FunctionDescriptor.of(JAVA_INT));
		
		System.out.println("Process Id: " + (int) getpid.invokeExact());
		
	}

}
