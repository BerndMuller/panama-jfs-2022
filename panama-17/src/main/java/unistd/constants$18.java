// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$18 {

    static final FunctionDescriptor syscall$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle syscall$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "syscall",
        "(J[Ljava/lang/Object;)J",
        constants$18.syscall$FUNC, true
    );
    static final FunctionDescriptor lockf$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle lockf$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "lockf",
        "(IIJ)I",
        constants$18.lockf$FUNC, false
    );
    static final FunctionDescriptor fdatasync$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle fdatasync$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "fdatasync",
        "(I)I",
        constants$18.fdatasync$FUNC, false
    );
    static final FunctionDescriptor crypt$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle crypt$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "crypt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$18.crypt$FUNC, false
    );
    static final FunctionDescriptor getentropy$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle getentropy$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "getentropy",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$18.getentropy$FUNC, false
    );
    static final MemorySegment __ILP32_OFF32_CFLAGS$SEGMENT = CLinker.toCString("-m32", ResourceScope.newImplicitScope());
}


