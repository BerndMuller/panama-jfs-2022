package de.pdbm;

import java.lang.foreign.Linker;
import java.lang.foreign.FunctionDescriptor;

import static java.lang.foreign.ValueLayout.JAVA_INT;

import java.lang.invoke.MethodHandle;


/**
 * Runs the C function getpid() and prints result.
 * 
 * @author bernd
 *
 */
public class ProcessId {

	public static void main(String[] args) throws Throwable {

		MethodHandle getpid =  Linker.nativeLinker().downcallHandle(
				Linker.nativeLinker().defaultLookup().lookup("getpid").get(),
				FunctionDescriptor.of(JAVA_INT));
		
		System.out.println("Process Id: " + (int) getpid.invokeExact());
		
	}

}
