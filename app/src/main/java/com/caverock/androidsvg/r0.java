package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Cloneable {
    public a1 A;
    public Float B;
    public d0 C;
    public Float D;
    public d0[] E;
    public d0 F;
    public Float G;
    public u H;
    public ArrayList I;
    public d0 J;
    public Integer K;
    public Boolean L;
    public com.google.firebase.messaging.o M;
    public String N;
    public String O;
    public String P;
    public Boolean Q;
    public Boolean R;
    public a1 S;
    public Float T;
    public String U;
    public String V;
    public a1 W;
    public Float X;
    public a1 Y;
    public Float Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public long e = 0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public a1 y;
    public Float z;

    public static r0 a() {
        r0 r0Var = new r0();
        r0Var.e = -1L;
        u uVar = u.y;
        r0Var.y = uVar;
        r0Var.a0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        r0Var.z = fValueOf;
        r0Var.A = null;
        r0Var.B = fValueOf;
        r0Var.C = new d0(1.0f);
        r0Var.b0 = 1;
        r0Var.c0 = 1;
        r0Var.D = Float.valueOf(4.0f);
        r0Var.E = null;
        r0Var.F = new d0(0.0f);
        r0Var.G = fValueOf;
        r0Var.H = uVar;
        r0Var.I = null;
        r0Var.J = new d0(7, 12.0f);
        r0Var.K = 400;
        r0Var.d0 = 1;
        r0Var.e0 = 1;
        r0Var.f0 = 1;
        r0Var.g0 = 1;
        Boolean bool = Boolean.TRUE;
        r0Var.L = bool;
        r0Var.M = null;
        r0Var.N = null;
        r0Var.O = null;
        r0Var.P = null;
        r0Var.Q = bool;
        r0Var.R = bool;
        r0Var.S = uVar;
        r0Var.T = fValueOf;
        r0Var.U = null;
        r0Var.h0 = 1;
        r0Var.V = null;
        r0Var.W = null;
        r0Var.X = fValueOf;
        r0Var.Y = null;
        r0Var.Z = fValueOf;
        r0Var.i0 = 1;
        r0Var.j0 = 1;
        return r0Var;
    }

    public final Object clone() {
        r0 r0Var = (r0) super.clone();
        d0[] d0VarArr = this.E;
        if (d0VarArr != null) {
            r0Var.E = (d0[]) d0VarArr.clone();
        }
        return r0Var;
    }
}
