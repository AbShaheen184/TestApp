package com.google.android.material.carousel;

import androidx.media3.container.f;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {
    public final /* synthetic */ CarouselLayoutManager A;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 2);
        this.z = i;
        switch (i) {
            case 1:
                this.A = carouselLayoutManager;
                super(0, 2);
                break;
            default:
                this.A = carouselLayoutManager;
                break;
        }
    }

    @Override // androidx.media3.container.f
    public final int h() {
        switch (this.z) {
            case 0:
                return this.A.n;
            default:
                CarouselLayoutManager carouselLayoutManager = this.A;
                return carouselLayoutManager.n - carouselLayoutManager.C();
        }
    }

    @Override // androidx.media3.container.f
    public final int i() {
        switch (this.z) {
            case 0:
                return this.A.D();
            default:
                return 0;
        }
    }

    @Override // androidx.media3.container.f
    public final int l() {
        switch (this.z) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.A;
                return carouselLayoutManager.m - carouselLayoutManager.E();
            default:
                return this.A.m;
        }
    }

    @Override // androidx.media3.container.f
    public final int m() {
        switch (this.z) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.A;
                if (carouselLayoutManager.A0()) {
                    return carouselLayoutManager.m;
                }
                return 0;
        }
    }

    @Override // androidx.media3.container.f
    public final int n() {
        switch (this.z) {
            case 0:
                return 0;
            default:
                return this.A.F();
        }
    }
}
