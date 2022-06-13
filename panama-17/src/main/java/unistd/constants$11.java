// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$11 {

    static final FunctionDescriptor linkat$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle linkat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "linkat",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$11.linkat$FUNC, false
    );
    static final FunctionDescriptor symlink$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle symlink$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "symlink",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.symlink$FUNC, false
    );
    static final FunctionDescriptor readlink$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle readlink$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "readlink",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$11.readlink$FUNC, false
    );
    static final FunctionDescriptor symlinkat$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle symlinkat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "symlinkat",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$11.symlinkat$FUNC, false
    );
    static final FunctionDescriptor readlinkat$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle readlinkat$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "readlinkat",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$11.readlinkat$FUNC, false
    );
    static final FunctionDescriptor unlink$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle unlink$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "unlink",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$11.unlink$FUNC, false
    );
}

