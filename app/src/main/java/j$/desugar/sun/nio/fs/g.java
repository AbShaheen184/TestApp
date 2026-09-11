package j$.desugar.sun.nio.fs;

import j$.nio.file.LinkOption;
import j$.nio.file.OpenOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.a0;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.FileTime;
import j$.nio.file.attribute.t;
import j$.nio.file.attribute.u;
import j$.nio.file.attribute.v;
import j$.nio.file.attribute.w;
import j$.nio.file.b0;
import j$.nio.file.y;
import j$.nio.file.z;
import j$.time.ZoneId;
import java.nio.file.CopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static /* synthetic */ StandardOpenOption d(j$.nio.file.StandardOpenOption standardOpenOption) {
        if (standardOpenOption == null) {
            return null;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.READ) {
            return StandardOpenOption.READ;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return standardOpenOption == j$.nio.file.StandardOpenOption.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    public static /* synthetic */ String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ List o(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ Set p(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ LinkOption[] q(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ CopyOption[] t(j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption cVar;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                cVar = null;
            } else if (copyOption instanceof j$.nio.file.b) {
                cVar = ((j$.nio.file.b) copyOption).a;
            } else if (copyOption instanceof LinkOption) {
                cVar = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                cVar = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                cVar = new j$.nio.file.c(copyOption);
            }
            copyOptionArr2[i] = cVar;
        }
        return copyOptionArr2;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] u(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static FileTime c(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new FileTime(fileTime.toMillis());
    }

    public static WatchEvent.Kind[] v(b0[] b0VarArr) {
        WatchEvent.Kind a0Var;
        if (b0VarArr == null) {
            return null;
        }
        int length = b0VarArr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            b0 b0Var = b0VarArr[i];
            if (b0Var == null) {
                a0Var = null;
            } else if (b0Var == y.b) {
                a0Var = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (b0Var == y.c) {
                a0Var = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (b0Var == y.d) {
                a0Var = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (b0Var == y.a) {
                a0Var = StandardWatchEventKinds.OVERFLOW;
            } else {
                a0Var = b0Var instanceof z ? ((z) b0Var).a : new a0(b0Var);
            }
            kindArr[i] = a0Var;
        }
        return kindArr;
    }

    public static Class h(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return u.class;
        }
        if (cls == u.class) {
            return PosixFileAttributes.class;
        }
        if (cls == j$.nio.file.attribute.h.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return j$.nio.file.attribute.h.class;
        }
        j$.util.a.a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    public static java.nio.file.attribute.FileTime e(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    public static FileAttribute[] s(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        FileAttribute iVar;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        FileAttribute[] fileAttributeArr2 = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            java.nio.file.attribute.FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                iVar = null;
            } else if (m(fileAttribute.value())) {
                iVar = new h(fileAttribute);
            } else {
                iVar = fileAttribute instanceof j$.nio.file.attribute.j ? ((j$.nio.file.attribute.j) fileAttribute).a : new j$.nio.file.attribute.i(fileAttribute);
            }
            fileAttributeArr2[i] = iVar;
        }
        return fileAttributeArr2;
    }

    public static b0[] r(WatchEvent.Kind[] kindArr) {
        b0 zVar;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        b0[] b0VarArr = new b0[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                zVar = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                zVar = y.b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                zVar = y.c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                zVar = y.d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                zVar = y.a;
            } else {
                zVar = kind instanceof a0 ? ((a0) kind).a : new z(kind);
            }
            b0VarArr[i] = zVar;
        }
        return b0VarArr;
    }

    public static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return j$.nio.file.p.u((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? j$.nio.file.o.u((java.nio.file.Path) obj) : obj;
    }

    public static char x(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static Class g(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return j$.nio.file.attribute.d.class;
        }
        if (cls == j$.nio.file.attribute.d.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return t.class;
        }
        if (cls == t.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return j$.nio.file.attribute.q.class;
        }
        if (cls == j$.nio.file.attribute.q.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == j$.nio.file.attribute.g.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return j$.nio.file.attribute.g.class;
        }
        if (cls == w.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return w.class;
        }
        if (cls == j$.nio.file.attribute.a.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return j$.nio.file.attribute.a.class;
        }
        j$.util.a.a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    public static java.nio.file.attribute.FileAttribute[] w(FileAttribute[] fileAttributeArr) {
        java.nio.file.attribute.FileAttribute jVar;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                jVar = null;
            } else if (m(fileAttribute.value())) {
                jVar = new j$.nio.file.attribute.k(fileAttribute);
            } else {
                jVar = fileAttribute instanceof j$.nio.file.attribute.i ? ((j$.nio.file.attribute.i) fileAttribute).a : new j$.nio.file.attribute.j(fileAttribute);
            }
            fileAttributeArr2[i] = jVar;
        }
        return fileAttributeArr2;
    }

    public static boolean m(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof v) || (next instanceof PosixFilePermission);
    }

    public static String b(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Set k(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof OpenOption) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.m.a((OpenOption) it.next()));
                } catch (ClassCastException e) {
                    j$.util.a.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.nio.file.OpenOption)) {
                j$.util.a.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.l.a((java.nio.file.OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    j$.util.a.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static String a(long j, String str, Locale locale) {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static Object j(Object obj) {
        if (obj instanceof java.nio.file.attribute.FileTime) {
            try {
                return c((java.nio.file.attribute.FileTime) obj);
            } catch (ClassCastException e) {
                j$.util.a.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof FileTime)) {
            return obj;
        }
        try {
            return e((FileTime) obj);
        } catch (ClassCastException e2) {
            j$.util.a.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static Map i(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, j(map.get(str)));
        }
        return map2;
    }

    public static Set l(Set set) {
        v vVar;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof v) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    v vVar2 = (v) it.next();
                    if (vVar2 == null) {
                        posixFilePermission = null;
                    } else if (vVar2 == v.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (vVar2 == v.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (vVar2 == v.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (vVar2 == v.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (vVar2 == v.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (vVar2 == v.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (vVar2 == v.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = vVar2 == v.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                j$.util.a.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        vVar = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        vVar = v.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        vVar = v.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        vVar = v.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        vVar = v.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        vVar = v.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        vVar = v.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        vVar = v.OTHERS_READ;
                    } else {
                        vVar = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? v.OTHERS_WRITE : v.OTHERS_EXECUTE;
                    }
                    hashSet.add(vVar);
                } catch (ClassCastException e2) {
                    j$.util.a.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static j$.time.a y() {
        return new j$.time.a(ZoneId.systemDefault());
    }
}
