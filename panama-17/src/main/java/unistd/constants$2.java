// Generated by jextract

package unistd;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$2 {

    static final FunctionDescriptor ualarm$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle ualarm$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "ualarm",
        "(II)I",
        constants$2.ualarm$FUNC, false
    );
    static final FunctionDescriptor usleep$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle usleep$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "usleep",
        "(I)I",
        constants$2.usleep$FUNC, false
    );
    static final FunctionDescriptor pause$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle pause$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "pause",
        "()I",
        constants$2.pause$FUNC, false
    );
    static final FunctionDescriptor chown$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle chown$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "chown",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$2.chown$FUNC, false
    );
    static final FunctionDescriptor fchown$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle fchown$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "fchown",
        "(III)I",
        constants$2.fchown$FUNC, false
    );
    static final FunctionDescriptor lchown$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle lchown$MH = RuntimeHelper.downcallHandle(
        unistd_h.LIBRARIES, "lchown",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$2.lchown$FUNC, false
    );
}

