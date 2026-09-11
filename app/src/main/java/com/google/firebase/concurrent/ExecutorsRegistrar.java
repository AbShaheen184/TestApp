package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.material.shape.k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.n;
import com.google.firebase.components.r;
import com.google.firebase.components.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new com.google.firebase.components.f(2));
    public static final n b = new n(new com.google.firebase.components.f(3));
    public static final n c = new n(new com.google.firebase.components.f(4));
    public static final n d = new n(new com.google.firebase.components.f(5));

    public static f a() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        builderDetectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(com.google.firebase.annotations.concurrent.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(com.google.firebase.annotations.concurrent.a.class, ExecutorService.class), new r(com.google.firebase.annotations.concurrent.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            k.D(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        com.google.firebase.components.b bVar = new com.google.firebase.components.b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s(1), hashSet3);
        r rVar3 = new r(com.google.firebase.annotations.concurrent.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(com.google.firebase.annotations.concurrent.b.class, ExecutorService.class), new r(com.google.firebase.annotations.concurrent.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            k.D(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        com.google.firebase.components.b bVar2 = new com.google.firebase.components.b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new s(2), hashSet6);
        r rVar5 = new r(com.google.firebase.annotations.concurrent.c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(com.google.firebase.annotations.concurrent.c.class, ExecutorService.class), new r(com.google.firebase.annotations.concurrent.c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            k.D(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        com.google.firebase.components.b bVar3 = new com.google.firebase.components.b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new s(3), hashSet9);
        com.google.firebase.components.a aVarA = com.google.firebase.components.b.a(new r(com.google.firebase.annotations.concurrent.d.class, Executor.class));
        aVarA.f = new s(4);
        return Arrays.asList(bVar, bVar2, bVar3, aVarA.b());
    }
}
