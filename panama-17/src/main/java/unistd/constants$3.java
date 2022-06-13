// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$3 {

    static final FunctionDescriptor fchownat$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle fchownat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "fchownat",
        "(ILjdk/incubator/foreign/MemoryAddress;III)I",
        constants$3.fchownat$FUNC, false
    );
    static final FunctionDescriptor chdir$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle chdir$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "chdir",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$3.chdir$FUNC, false
    );
    static final FunctionDescriptor fchdir$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle fchdir$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "fchdir",
        "(I)I",
        constants$3.fchdir$FUNC, false
    );
    static final FunctionDescriptor getcwd$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle getcwd$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "getcwd",
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$3.getcwd$FUNC, false
    );
    static final FunctionDescriptor getwd$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle getwd$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "getwd",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$3.getwd$FUNC, false
    );
    static final FunctionDescriptor dup$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle dup$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "dup",
        "(I)I",
        constants$3.dup$FUNC, false
    );
}


