package com.example.shell.nativex;


import com.sun.jna.*;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import org.springframework.nativex.hint.*;
import org.springframework.nativex.type.NativeConfiguration;

import java.util.Base64;

/**
 *
 * I took this from a project of Janne's
 *
 * @author Janne Valkealahti
 */
@NativeHint(
        resources = @ResourceHint(
                patterns = {
                        "completion/.*",
                        "template/.*.st",
                        "org/springframework/shell/component/.*.stg",
                        "com/sun/jna/win32-x86-64/jnidispatch.dll"
                }),
        types = {
                @TypeHint(
                        types = {
                                CallbackReference.class, Native.class,
                                NativeLong.class, PointerByReference.class, IntByReference.class, Base64.Decoder.class
                        },
                        typeNames = {"com.sun.jna.Klass"},
                        access = {
                                TypeAccess.PUBLIC_CLASSES, TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.PUBLIC_FIELDS,
                                TypeAccess.PUBLIC_METHODS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        types = Structure.class,
                        fields = {
                                @FieldHint(name = "memory", allowWrite = true),
                                @FieldHint(name = "typeInfo")
                        },
                        methods = {
                                @MethodHint(name = "newInstance", parameterTypes = {Class.class, Pointer.class}),
                                @MethodHint(name = "newInstance", parameterTypes = {Class.class, long.class}),
                                @MethodHint(name = "newInstance", parameterTypes = {Class.class})
                        },
                        access = {
                                TypeAccess.PUBLIC_CLASSES, TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.PUBLIC_FIELDS,
                                TypeAccess.PUBLIC_METHODS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "com.sun.jna.Structure$FFIType",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "com.sun.jna.Structure$FFIType$size_t",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$CHAR_INFO",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$CONSOLE_CURSOR_INFO",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$CONSOLE_SCREEN_BUFFER_INFO",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$COORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$INPUT_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$INPUT_RECORD$EventUnion",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$KEY_EVENT_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$MOUSE_EVENT_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$WINDOW_BUFFER_SIZE_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$MENU_EVENT_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$FOCUS_EVENT_RECORD",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$SMALL_RECT",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                ),
                @TypeHint(
                        typeNames = "org.jline.terminal.impl.jna.win.Kernel32$UnionChar",
                        access = {
                                TypeAccess.PUBLIC_CONSTRUCTORS, TypeAccess.DECLARED_CLASSES, TypeAccess.DECLARED_CONSTRUCTORS,
                                TypeAccess.DECLARED_FIELDS, TypeAccess.DECLARED_METHODS
                        }
                )
        },
        jdkProxies = {
                @JdkProxyHint(typeNames = {"com.sun.jna.Library"}),
                @JdkProxyHint(typeNames = {"com.sun.jna.Callback"}),
                @JdkProxyHint(typeNames = {"org.jline.terminal.impl.jna.win.Kernel32"}),
                @JdkProxyHint(typeNames = {"org.jline.terminal.impl.jna.linux.CLibrary"})
        }
)
public class ShellNativeConfiguration implements NativeConfiguration {
}