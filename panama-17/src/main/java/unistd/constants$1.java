// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1 {

    static final FunctionDescriptor write$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle write$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "write",
        "(ILjdk/incubator/foreign/MemoryAddress;J)J",
        constants$1.write$FUNC, false
    );
    static final FunctionDescriptor pread$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle pread$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "pread",
        "(ILjdk/incubator/foreign/MemoryAddress;JJ)J",
        constants$1.pread$FUNC, false
    );
    static final FunctionDescriptor pwrite$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle pwrite$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "pwrite",
        "(ILjdk/incubator/foreign/MemoryAddress;JJ)J",
        constants$1.pwrite$FUNC, false
    );
    static final FunctionDescriptor pipe$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle pipe$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "pipe",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1.pipe$FUNC, false
    );
    static final FunctionDescriptor alarm$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle alarm$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "alarm",
        "(I)I",
        constants$1.alarm$FUNC, false
    );
    static final FunctionDescriptor sleep$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle sleep$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "sleep",
        "(I)I",
        constants$1.sleep$FUNC, false
    );
}

