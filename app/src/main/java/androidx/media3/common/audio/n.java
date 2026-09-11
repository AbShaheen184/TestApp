package androidx.media3.common.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements m {
    public j b;
    public j c;
    public j d;
    public j e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public n() {
        ByteBuffer byteBuffer = m.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.b = jVar;
        this.c = jVar;
    }

    @Override // androidx.media3.common.audio.m
    public boolean a() {
        return this.h && this.g == m.a;
    }

    @Override // androidx.media3.common.audio.m
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = m.a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.m
    public final void d(k kVar) {
        this.g = m.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // androidx.media3.common.audio.m
    public final void e() {
        this.h = true;
        j();
    }

    @Override // androidx.media3.common.audio.m
    public final j f(j jVar) {
        this.d = jVar;
        this.e = h(jVar);
        return isActive() ? this.e : j.e;
    }

    public abstract j h(j jVar);

    @Override // androidx.media3.common.audio.m
    public boolean isActive() {
        return this.e != j.e;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.m
    public final void reset() {
        ByteBuffer byteBuffer = m.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.b = jVar;
        this.c = jVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
