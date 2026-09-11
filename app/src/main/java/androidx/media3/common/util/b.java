package androidx.media3.common.util;

import android.content.Context;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.PowerManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.collection.y0;
import androidx.compose.foundation.r0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.media3.exoplayer.source.v0;
import androidx.recyclerview.widget.p0;
import androidx.recyclerview.widget.u0;
import androidx.recyclerview.widget.w0;
import androidx.recyclerview.widget.x0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements androidx.media3.datasource.g, androidx.media3.exoplayer.hls.playlist.u, androidx.media3.exoplayer.upstream.p, androidx.media3.extractor.i, androidx.media3.extractor.ts.z, androidx.sqlite.b, coil3.target.a {
    public final /* synthetic */ int e;
    public Object y;
    public Object z;

    public b(int i) {
        this.e = i;
        switch (i) {
            case 4:
                this.y = new HashMap();
                this.z = new ArrayList();
                break;
            case 7:
                this.y = new HashMap();
                this.z = androidx.media3.exoplayer.b.b;
                break;
            case 13:
                this.y = ByteBuffer.allocateDirect(500);
                break;
            case 17:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.y = byteArrayOutputStream;
                this.z = new DataOutputStream(byteArrayOutputStream);
                break;
            case 21:
                this.y = new SparseIntArray();
                this.z = new SparseIntArray();
                break;
            case 24:
                this.y = new y0(0);
                this.z = new androidx.collection.s((Object) null);
                break;
            default:
                this.y = new HashMap();
                break;
        }
    }

    public static void i(b bVar, boolean z, boolean z2) {
        synchronized (bVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) bVar.z) == null) {
                    if (((Context) bVar.y).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        c.t("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.y).getSystemService("power");
                    if (powerManager == null) {
                        c.t("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        bVar.z = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.z;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static void k(b bVar, androidx.media3.exoplayer.b bVar2) {
        bVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) bVar.y).entrySet()) {
            if (entry.getKey() != null) {
                androidx.transition.k.i();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!q(bVar2, list).equals(q((androidx.media3.exoplayer.b) bVar.z, list))) {
                    throw null;
                }
            }
        }
        bVar.z = bVar2;
    }

    public static androidx.media3.exoplayer.b q(androidx.media3.exoplayer.b bVar, List list) {
        bVar.getClass();
        Map map = bVar.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new androidx.media3.exoplayer.b(map2);
    }

    public static int x(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A() throws IOException {
        String str = (String) this.y;
        if (((FileChannel) this.z) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.z = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.z;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.z = null;
            throw new IllegalStateException(androidx.privacysandbox.ads.adservices.java.internal.a.q("Unable to lock file: '", str, "'."), th);
        }
    }

    public void B(int i, int i2) {
        int[] iArr = (int[]) this.y;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        s(i3);
        int[] iArr2 = (int[]) this.y;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.y, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) ((ArrayList) this.z).get(size);
            int i4 = u0Var.e;
            if (i4 >= i) {
                u0Var.e = i4 + i2;
            }
        }
    }

    @Override // androidx.sqlite.b
    public boolean C() {
        return ((androidx.sqlite.b) this.y).C();
    }

    public void D(int i, int i2) {
        int[] iArr = (int[]) this.y;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        s(i3);
        int[] iArr2 = (int[]) this.y;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.y;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.z;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u0 u0Var = (u0) ((ArrayList) this.z).get(size);
            int i4 = u0Var.e;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.z).remove(size);
                } else {
                    u0Var.e = i4 - i2;
                }
            }
        }
    }

    public androidx.core.view.r E(p0 p0Var, int i) {
        x0 x0Var;
        androidx.core.view.r rVar;
        y0 y0Var = (y0) this.y;
        int iD = y0Var.d(p0Var);
        if (iD >= 0 && (x0Var = (x0) y0Var.i(iD)) != null) {
            int i2 = x0Var.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                x0Var.a = i3;
                if (i == 4) {
                    rVar = x0Var.b;
                } else {
                    if (i != 8) {
                        net.luminis.tls.engine.impl.c.o("Must provide flag PRE or POST");
                        return null;
                    }
                    rVar = x0Var.c;
                }
                if ((i3 & 12) == 0) {
                    y0Var.g(iD);
                    x0Var.a = 0;
                    x0Var.b = null;
                    x0Var.c = null;
                    x0.d.c(x0Var);
                }
                return rVar;
            }
        }
        return null;
    }

    public void F(p0 p0Var) {
        x0 x0Var = (x0) ((y0) this.y).get(p0Var);
        if (x0Var == null) {
            return;
        }
        x0Var.a &= -2;
    }

    public void G(p0 p0Var) {
        androidx.collection.s sVar = (androidx.collection.s) this.z;
        for (int iG = sVar.g() - 1; iG >= 0; iG--) {
            if (p0Var == sVar.h(iG)) {
                Object[] objArr = sVar.z;
                Object obj = objArr[iG];
                Object obj2 = androidx.collection.t.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                sVar.e = true;
                break;
            }
        }
        x0 x0Var = (x0) ((y0) this.y).remove(p0Var);
        if (x0Var != null) {
            x0Var.a = 0;
            x0Var.b = null;
            x0Var.c = null;
            x0.d.c(x0Var);
        }
    }

    public a H() throws IOException {
        File file = (File) this.z;
        File file2 = (File) this.y;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                c.t("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new a(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new a(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    public androidx.media3.extractor.h0 I(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.y;
            if (i2 >= iArr.length) {
                c.f("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new androidx.media3.extractor.m();
            }
            if (i == iArr[i2]) {
                return ((v0[]) this.z)[i2];
            }
            i2++;
        }
    }

    public void J() {
        synchronized (this) {
            ((AtomicInteger) this.y).decrementAndGet();
            if (((AtomicInteger) this.y).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void K(ArrayList arrayList) {
        androidx.media3.container.u uVar;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((androidx.media3.container.t) arrayList.get(i)).a == 1) {
                try {
                    uVar = new androidx.media3.container.u((androidx.media3.container.t) arrayList.get(i));
                } catch (androidx.media3.container.s unused) {
                    uVar = null;
                }
                this.z = uVar;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // androidx.media3.extractor.i
    public androidx.media3.extractor.h a(androidx.media3.extractor.o r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.b.a(androidx.media3.extractor.o, long):androidx.media3.extractor.h");
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public androidx.media3.exoplayer.upstream.p b(androidx.media3.exoplayer.hls.playlist.q qVar, androidx.media3.exoplayer.hls.playlist.n nVar) {
        return new b(11, ((androidx.media3.exoplayer.hls.playlist.u) this.y).b(qVar, nVar), (List) this.z);
    }

    @Override // androidx.media3.extractor.ts.z
    public void c(w wVar) {
        androidx.media3.extractor.ts.c0 c0Var = (androidx.media3.extractor.ts.c0) this.z;
        SparseArray sparseArray = c0Var.h;
        v vVar = (v) this.y;
        if (wVar.z() == 0 && (wVar.z() & 128) != 0) {
            wVar.N(6);
            int iA = wVar.a() / 4;
            for (int i = 0; i < iA; i++) {
                wVar.k(vVar.b, 0, 4);
                vVar.m(0);
                int iG = vVar.g(16);
                vVar.o(3);
                if (iG == 0) {
                    vVar.o(13);
                } else {
                    int iG2 = vVar.g(13);
                    if (sparseArray.get(iG2) == null) {
                        sparseArray.put(iG2, new androidx.media3.extractor.ts.a0(new androidx.fragment.app.h(c0Var, iG2)));
                        c0Var.n++;
                    }
                }
            }
            if (c0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // coil3.target.a
    public void e(coil3.k kVar) {
        androidx.compose.ui.graphics.painter.b bVarL;
        coil3.request.g gVar = (coil3.request.g) this.y;
        coil3.compose.i iVar = (coil3.compose.i) this.z;
        androidx.compose.ui.graphics.painter.b bVarD = kVar != null ? coil3.compose.k.d(kVar, gVar.a, iVar.M) : null;
        if (bVarD == null && ((Boolean) coil3.m.d(gVar, coil3.compose.k.b)).booleanValue() && (bVarL = iVar.l()) != null) {
            bVarD = bVarL;
        }
        coil3.compose.i.k(iVar, new coil3.compose.f(bVarD));
    }

    @Override // androidx.media3.datasource.g
    public androidx.media3.datasource.h f() {
        switch (this.e) {
            case 2:
                return new androidx.media3.datasource.m((Context) this.y, ((androidx.media3.datasource.g) this.z).f());
            default:
                return new androidx.media3.datasource.okhttp.a((okhttp3.y) this.z, (b) this.y);
        }
    }

    @Override // androidx.media3.extractor.i
    public void g() {
        w wVar = (w) this.z;
        byte[] bArr = j0.b;
        wVar.getClass();
        wVar.K(bArr, bArr.length);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.u
    public androidx.media3.exoplayer.upstream.p h() {
        return new b(11, ((androidx.media3.exoplayer.hls.playlist.u) this.y).h(), (List) this.z);
    }

    @Override // androidx.media3.exoplayer.upstream.p
    public Object j(Uri uri, androidx.media3.datasource.j jVar) {
        androidx.media3.exoplayer.offline.a aVar = (androidx.media3.exoplayer.offline.a) ((androidx.media3.exoplayer.upstream.p) this.y).j(uri, jVar);
        List list = (List) this.z;
        return (list == null || list.isEmpty()) ? aVar : (androidx.media3.exoplayer.offline.a) aVar.a(list);
    }

    public void l(p0 p0Var, androidx.core.view.r rVar) {
        y0 y0Var = (y0) this.y;
        x0 x0VarA = (x0) y0Var.get(p0Var);
        if (x0VarA == null) {
            x0VarA = x0.a();
            y0Var.put(p0Var, x0VarA);
        }
        x0VarA.c = rVar;
        x0VarA.a |= 8;
    }

    public boolean m() {
        synchronized (this) {
            if (((AtomicBoolean) this.z).get()) {
                return false;
            }
            ((AtomicInteger) this.y).incrementAndGet();
            return true;
        }
    }

    public void n(Object obj, String str) {
        HashMap map = (HashMap) this.y;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.z).remove(str);
    }

    public void o() {
        switch (this.e) {
            case 8:
                this.y = null;
                this.z = null;
                break;
            default:
                int[] iArr = (int[]) this.y;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.z = null;
                break;
        }
    }

    public boolean p(int i) {
        return ((androidx.media3.common.o) this.y).a.get(i);
    }

    public byte[] r(androidx.media3.extractor.metadata.emsg.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.z;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.y;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            net.luminis.tls.engine.impl.c.k(e);
            return null;
        }
    }

    public void s(int i) {
        int[] iArr = (int[]) this.y;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.y = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.y = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.y;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    @Override // androidx.sqlite.b
    public androidx.sqlite.a t(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        androidx.constraintlayout.core.widgets.analyzer.e eVar = (androidx.constraintlayout.core.widgets.analyzer.e) this.z;
        if (!str.equals(":memory:")) {
            str = ((androidx.room.a) eVar.d).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        androidx.room.concurrent.a aVar = new androidx.room.concurrent.a(str, (eVar.b || eVar.c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = aVar.a;
        reentrantLock.lock();
        b bVar = aVar.b;
        if (bVar != null) {
            try {
                bVar.A();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (eVar.c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                androidx.sqlite.a aVarT = ((androidx.sqlite.b) this.y).t(str);
                if (eVar.b) {
                    androidx.constraintlayout.core.widgets.analyzer.e.f(aVarT);
                    if (((androidx.room.a) eVar.d).f == androidx.room.p.y) {
                        h1.l(aVarT, "PRAGMA synchronous = NORMAL");
                    } else {
                        h1.l(aVarT, "PRAGMA synchronous = FULL");
                    }
                    ((androidx.emoji2.text.g) eVar.e).w(aVarT);
                } else {
                    try {
                        eVar.c = true;
                        androidx.constraintlayout.core.widgets.analyzer.e.a(eVar, aVarT);
                        eVar.c = false;
                    } catch (Throwable th2) {
                        eVar.c = false;
                        throw th2;
                    }
                }
                if (bVar != null && (fileChannel2 = (FileChannel) bVar.z) != null) {
                    try {
                        fileChannel2.close();
                        bVar.z = null;
                    } catch (Throwable th3) {
                        bVar.z = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return aVarT;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (bVar != null && (fileChannel = (FileChannel) bVar.z) != null) {
                try {
                    fileChannel.close();
                } finally {
                    bVar.z = null;
                }
            }
            throw th5;
        }
        th = th4;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        androidx.media3.extractor.mp4.d dVar = (androidx.media3.extractor.mp4.d) this.z;
        w0 w0Var = (w0) this.y;
        int iR = w0Var.r();
        int iU = w0Var.u();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewX = w0Var.x(i);
            int iN = w0Var.n(viewX);
            int iA = w0Var.A(viewX);
            dVar.b = iR;
            dVar.c = iU;
            dVar.d = iN;
            dVar.e = iA;
            if (i3 != 0) {
                dVar.a = i3;
                if (dVar.a()) {
                    return viewX;
                }
            }
            if (i4 != 0) {
                dVar.a = i4;
                if (dVar.a()) {
                    view = viewX;
                }
            }
            i += i5;
        }
        return view;
    }

    public androidx.media3.extractor.n v(Object... objArr) {
        Constructor constructorC;
        synchronized (((AtomicBoolean) this.z)) {
            if (!((AtomicBoolean) this.z).get()) {
                try {
                    constructorC = ((androidx.media3.exoplayer.hls.playlist.a) this.y).c();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.z).set(true);
                    constructorC = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorC = null;
        }
        if (constructorC == null) {
            return null;
        }
        try {
            return (androidx.media3.extractor.n) constructorC.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public synchronized Map w() {
        try {
            if (((Map) this.z) == null) {
                this.z = Collections.unmodifiableMap(new HashMap((HashMap) this.y));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.z;
    }

    public void y() {
        ((SparseIntArray) this.y).clear();
    }

    public boolean z(View view) {
        androidx.media3.extractor.mp4.d dVar = (androidx.media3.extractor.mp4.d) this.z;
        w0 w0Var = (w0) this.y;
        int iR = w0Var.r();
        int iU = w0Var.u();
        int iN = w0Var.n(view);
        int iA = w0Var.A(view);
        dVar.b = iR;
        dVar.c = iU;
        dVar.d = iN;
        dVar.e = iA;
        dVar.a = 24579;
        return dVar.a();
    }

    @Override // androidx.media3.extractor.ts.z
    public void d(h0 h0Var, androidx.media3.extractor.p pVar, androidx.media3.extractor.ts.e0 e0Var) {
    }

    public /* synthetic */ b(int i, boolean z) {
        this.e = i;
    }

    public b(String str) {
        this.e = 28;
        this.y = str.concat(".lck");
    }

    public b(r0 r0Var) {
        this.e = 27;
        this.y = new AtomicInteger(0);
        this.z = new AtomicBoolean(false);
    }

    public b(File file) {
        this.e = 0;
        this.y = file;
        this.z = new File(file.getPath() + ".bak");
    }

    public b(androidx.constraintlayout.core.widgets.analyzer.e eVar, androidx.sqlite.b bVar) {
        this.e = 25;
        bVar.getClass();
        this.z = eVar;
        this.y = bVar;
    }

    public b(h0 h0Var) {
        this.e = 19;
        this.y = h0Var;
        this.z = new w();
    }

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    public b(Context context, androidx.media3.datasource.g gVar) {
        this.e = 2;
        this.y = context.getApplicationContext();
        this.z = gVar;
    }

    public b(okhttp3.y yVar) {
        this.e = 5;
        this.z = yVar;
        this.y = new b(3);
    }

    public b(androidx.media3.common.o oVar, SparseArray sparseArray) {
        this.e = 9;
        this.y = oVar;
        SparseBooleanArray sparseBooleanArray = oVar.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            com.google.android.material.motion.a.j(i, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i);
            androidx.media3.exoplayer.analytics.a aVar = (androidx.media3.exoplayer.analytics.a) sparseArray.get(iKeyAt);
            aVar.getClass();
            sparseArray2.append(iKeyAt, aVar);
        }
        this.z = sparseArray2;
    }

    public b(Context context) {
        this.e = 1;
        this.y = context;
    }

    public b(w0 w0Var) {
        this.e = 23;
        this.y = w0Var;
        androidx.media3.extractor.mp4.d dVar = new androidx.media3.extractor.mp4.d();
        dVar.a = 0;
        this.z = dVar;
    }

    public b(MediaCodec.CryptoInfo cryptoInfo) {
        this.e = 6;
        this.y = cryptoInfo;
        this.z = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public b(androidx.media3.exoplayer.video.c cVar) {
        this.e = 14;
        this.z = cVar;
    }

    public b(androidx.media3.extractor.ts.c0 c0Var) {
        this.e = 20;
        this.z = c0Var;
        this.y = new v(new byte[4], 4);
    }

    public b(androidx.media3.exoplayer.hls.playlist.a aVar) {
        this.e = 15;
        this.y = aVar;
        this.z = new AtomicBoolean(false);
    }
}
