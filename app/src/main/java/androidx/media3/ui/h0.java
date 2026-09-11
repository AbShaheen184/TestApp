package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.common.b1;
import androidx.media3.common.f1;
import androidx.media3.common.g1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.e1;
import androidx.media3.exoplayer.image.ImageOutput;
import com.app.mlounge.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends FrameLayout {
    public final View A;
    public final boolean B;
    public final g0 C;
    public final ImageView D;
    public final ImageView E;
    public final SubtitleView F;
    public final View G;
    public final TextView H;
    public final v I;
    public final FrameLayout J;
    public final FrameLayout K;
    public final Handler L;
    public final Class M;
    public final Method N;
    public final Object O;
    public androidx.media3.common.q0 P;
    public boolean Q;
    public u R;
    public int S;
    public int T;
    public Drawable U;
    public int V;
    public boolean W;
    public CharSequence a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public final d0 e;
    public boolean e0;
    public boolean f0;
    public final AspectRatioFrameLayout y;
    public final View z;

    public h0(Context context) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        d0 d0Var = new d0(this);
        this.e = d0Var;
        this.L = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = false;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.M = null;
            this.N = null;
            this.O = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.y = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.z = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Build.VERSION.SDK_INT >= 34) {
                androidx.compose.ui.text.android.b.n(surfaceView);
            }
            this.A = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(d0Var);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.A = null;
        }
        this.B = false;
        this.C = Build.VERSION.SDK_INT == 34 ? new g0() : null;
        this.J = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.K = (FrameLayout) findViewById(R.id.exo_overlay);
        this.D = (ImageView) findViewById(R.id.exo_image);
        this.T = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.b0
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    h0 h0Var = this.a;
                    h0Var.L.post(new c0(0, h0Var, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.M = cls;
        this.N = method;
        this.O = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.E = imageView2;
        this.S = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.F = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.G = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.V = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.H = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        v vVar = (v) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (vVar != null) {
            this.I = vVar;
        } else if (viewFindViewById2 != null) {
            v vVar2 = new v(context);
            this.I = vVar2;
            vVar2.setId(R.id.exo_controller);
            vVar2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(vVar2, iIndexOfChild);
        } else {
            this.I = null;
        }
        v vVar3 = this.I;
        this.b0 = vVar3 != null ? 5000 : 0;
        this.e0 = true;
        this.c0 = true;
        this.d0 = true;
        this.Q = vVar3 != null;
        if (vVar3 != null) {
            a0 a0Var = vVar3.e;
            int i = a0Var.A;
            if (i != 3 && i != 2) {
                a0Var.f();
                a0Var.i(2);
            }
            v vVar4 = this.I;
            d0 d0Var2 = this.e;
            vVar4.getClass();
            d0Var2.getClass();
            vVar4.H.add(d0Var2);
        }
        setClickable(true);
        l();
    }

    public static void a(h0 h0Var, Bitmap bitmap) {
        h0Var.setImage(new BitmapDrawable(h0Var.getResources(), bitmap));
        androidx.media3.common.q0 q0Var = h0Var.P;
        if (q0Var != null) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            if (c0Var.u(30) && c0Var.m().a(2)) {
                return;
            }
        }
        ImageView imageView = h0Var.D;
        if (imageView != null) {
            imageView.setVisibility(0);
            h0Var.o();
        }
        View view = h0Var.z;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(androidx.media3.common.q0 q0Var) {
        Class cls = this.M;
        if (cls == null || !cls.isAssignableFrom(q0Var.getClass())) {
            return;
        }
        try {
            Method method = this.N;
            method.getClass();
            Object obj = this.O;
            obj.getClass();
            method.invoke(q0Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            net.luminis.tls.engine.impl.c.k(e);
        }
    }

    public final boolean b() {
        androidx.media3.common.q0 q0Var = this.P;
        if (q0Var == null || this.O == null) {
            return false;
        }
        androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
        return c0Var.u(30) && c0Var.m().a(4);
    }

    public final void c() {
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        androidx.media3.common.q0 q0Var = this.P;
        return q0Var != null && ((androidx.media3.exoplayer.c0) q0Var).u(16) && ((androidx.media3.exoplayer.c0) this.P).x() && ((androidx.media3.exoplayer.c0) this.P).p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g0 g0Var;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (g0Var = this.C) != null && this.f0) {
            g0Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        androidx.media3.common.q0 q0Var = this.P;
        if (q0Var != null && ((androidx.media3.exoplayer.c0) q0Var).u(16) && ((androidx.media3.exoplayer.c0) this.P).x()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        v vVar = this.I;
        if (z && p() && !vVar.j()) {
            e(true);
            return true;
        }
        if ((p() && vVar.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.d0) && p()) {
            v vVar = this.I;
            boolean z2 = vVar.j() && vVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.E;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.S == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.y;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        androidx.media3.common.q0 q0Var = this.P;
        if (q0Var == null) {
            return true;
        }
        int iQ = ((androidx.media3.exoplayer.c0) q0Var).q();
        if (!this.c0) {
            return false;
        }
        if (((androidx.media3.exoplayer.c0) this.P).u(17) && ((androidx.media3.exoplayer.c0) this.P).l().p()) {
            return false;
        }
        if (iQ != 1 && iQ != 4) {
            androidx.media3.common.q0 q0Var2 = this.P;
            q0Var2.getClass();
            if (((androidx.media3.exoplayer.c0) q0Var2).p()) {
                return false;
            }
        }
        return true;
    }

    public List<androidx.core.view.a0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.K;
        if (frameLayout != null) {
            arrayList.add(new androidx.core.view.a0(frameLayout));
        }
        v vVar = this.I;
        if (vVar != null) {
            arrayList.add(new androidx.core.view.a0(vVar));
        }
        return com.google.common.collect.h0.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.J;
        com.google.android.material.motion.a.m(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.S;
    }

    public boolean getControllerAutoShow() {
        return this.c0;
    }

    public boolean getControllerHideOnTouch() {
        return this.e0;
    }

    public int getControllerShowTimeoutMs() {
        return this.b0;
    }

    public Drawable getDefaultArtwork() {
        return this.U;
    }

    public int getImageDisplayMode() {
        return this.T;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.K;
    }

    public androidx.media3.common.q0 getPlayer() {
        return this.P;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.y;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.F;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.S != 0;
    }

    public boolean getUseController() {
        return this.Q;
    }

    public View getVideoSurfaceView() {
        return this.A;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.b0;
            v vVar = this.I;
            vVar.setShowTimeoutMs(i);
            a0 a0Var = vVar.e;
            v vVar2 = a0Var.a;
            if (!vVar2.l()) {
                vVar2.setVisibility(0);
                vVar2.m();
                ImageView imageView = vVar2.S;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            a0Var.k();
        }
    }

    public final void i() {
        if (!p() || this.P == null) {
            return;
        }
        v vVar = this.I;
        if (!vVar.j()) {
            e(true);
        } else if (this.e0) {
            vVar.g();
        }
    }

    public final void j() {
        f1 f1Var;
        androidx.media3.common.q0 q0Var = this.P;
        if (q0Var != null) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            c0Var.V();
            f1Var = c0Var.i0;
        } else {
            f1Var = f1.d;
        }
        int i = f1Var.a;
        int i2 = f1Var.b;
        float f = this.B ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * f1Var.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.y;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final void k() {
        boolean z;
        View view = this.G;
        if (view != null) {
            androidx.media3.common.q0 q0Var = this.P;
            if (q0Var == null || ((androidx.media3.exoplayer.c0) q0Var).q() != 2) {
                z = false;
            } else {
                int i = this.V;
                z = true;
                if (i != 2 && (i != 1 || !((androidx.media3.exoplayer.c0) this.P).p())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        v vVar = this.I;
        if (vVar == null || !this.Q) {
            setContentDescription(null);
        } else if (vVar.j()) {
            setContentDescription(this.e0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.H;
        if (textView != null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            androidx.media3.common.q0 q0Var = this.P;
            if (q0Var != null) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
                c0Var.V();
                androidx.media3.exoplayer.j jVar = c0Var.n0.f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final void n(boolean z) {
        boolean z2;
        boolean z3;
        Drawable drawable;
        androidx.media3.common.q0 q0Var = this.P;
        boolean zF = false;
        if (q0Var != null) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var;
            if (!c0Var.u(30) || c0Var.m().a.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        boolean z4 = this.W;
        ImageView imageView = this.E;
        View view = this.z;
        if (!z4 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z2) {
            androidx.media3.common.q0 q0Var2 = this.P;
            if (q0Var2 != null) {
                androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var2;
                if (c0Var2.u(30) && c0Var2.m().a(2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            boolean zB = b();
            if (!z3 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.D;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z3 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z3 && !zB && z5) {
                c();
            }
            if (!z3 && !zB && this.S != 0) {
                imageView.getClass();
                if (q0Var != null) {
                    androidx.media3.exoplayer.c0 c0Var3 = (androidx.media3.exoplayer.c0) q0Var;
                    if (c0Var3.u(18)) {
                        c0Var3.V();
                        byte[] bArr = c0Var3.S.f;
                        if (bArr != null) {
                            zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                        }
                    }
                }
                if (zF || f(this.U)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.D;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.T == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.y) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.P == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.Q) {
            return false;
        }
        this.I.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        com.google.android.material.motion.a.q(i == 0 || this.E != null);
        if (this.S != i) {
            this.S = i;
            n(false);
        }
    }

    public void setAspectRatioListener(a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.y;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.c0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.d0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.I.getClass();
        this.e0 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(l lVar) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setOnFullScreenModeChangedListener(lVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        v vVar = this.I;
        vVar.getClass();
        this.b0 = i;
        if (vVar.j()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(u uVar) {
        v vVar = this.I;
        vVar.getClass();
        u uVar2 = this.R;
        if (uVar2 == uVar) {
            return;
        }
        if (uVar2 != null) {
            vVar.H.remove(uVar2);
        }
        this.R = uVar;
        if (uVar != null) {
            vVar.getClass();
            vVar.H.add(uVar);
            setControllerVisibilityListener((e0) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        com.google.android.material.motion.a.q(this.H != null);
        this.a0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.U != drawable) {
            this.U = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.f0 = z;
    }

    public void setErrorMessageProvider(androidx.media3.common.n nVar) {
        if (nVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(f0 f0Var) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setOnFullScreenModeChangedListener(this.e);
    }

    public void setFullscreenButtonState(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.o(z);
    }

    public void setImageDisplayMode(int i) {
        com.google.android.material.motion.a.q(this.D != null);
        if (this.T != i) {
            this.T = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.W != z) {
            this.W = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(g1 g1Var) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setMediaRouteButtonViewProvider(g1Var);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01dc  */
    public void setPlayer(androidx.media3.common.q0 q0Var) {
        com.google.android.material.motion.a.q(Looper.myLooper() == Looper.getMainLooper());
        com.google.android.material.motion.a.f(q0Var == null || ((androidx.media3.exoplayer.c0) q0Var).s == Looper.getMainLooper());
        androidx.media3.common.q0 q0Var2 = this.P;
        if (q0Var2 == q0Var) {
            return;
        }
        View view = this.A;
        d0 d0Var = this.e;
        if (q0Var2 != null) {
            androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) q0Var2;
            c0Var.D(d0Var);
            if (c0Var.u(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    c0Var.V();
                    if (textureView == c0Var.Y) {
                        c0Var.b();
                    }
                } else if (view instanceof SurfaceView) {
                    c0Var.V();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    c0Var.V();
                    if (holder != null && holder == c0Var.V) {
                        c0Var.b();
                    }
                }
            }
            Class cls = this.M;
            if (cls != null && cls.isAssignableFrom(q0Var2.getClass())) {
                try {
                    Method method = this.N;
                    method.getClass();
                    method.invoke(q0Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    net.luminis.tls.engine.impl.c.k(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.F;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.P = q0Var;
        boolean zP = p();
        v vVar = this.I;
        if (zP) {
            vVar.setPlayer(q0Var);
        }
        k();
        m();
        n(true);
        if (q0Var == null) {
            if (vVar != null) {
                vVar.g();
                return;
            }
            return;
        }
        androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) q0Var;
        androidx.media3.exoplayer.x xVar = c0Var2.v;
        if (c0Var2.u(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                c0Var2.V();
                c0Var2.E();
                c0Var2.Y = textureView2;
                if (textureView2.getSurfaceTextureListener() != null) {
                    androidx.media3.common.util.c.t("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                }
                textureView2.setSurfaceTextureListener(xVar);
                SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    c0Var2.P(null);
                    c0Var2.B(0, 0);
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    c0Var2.P(surface);
                    c0Var2.U = surface;
                    c0Var2.B(textureView2.getWidth(), textureView2.getHeight());
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                c0Var2.V();
                if (surfaceView instanceof androidx.media3.exoplayer.video.t) {
                    c0Var2.E();
                    c0Var2.P(surfaceView);
                    c0Var2.L(surfaceView.getHolder());
                } else if (surfaceView instanceof androidx.media3.exoplayer.video.spherical.k) {
                    c0Var2.E();
                    c0Var2.W = (androidx.media3.exoplayer.video.spherical.k) surfaceView;
                    e1 e1VarC = c0Var2.c(c0Var2.w);
                    com.google.android.material.motion.a.q(!e1VarC.f);
                    e1VarC.c = 10000;
                    androidx.media3.exoplayer.video.spherical.k kVar = c0Var2.W;
                    com.google.android.material.motion.a.q(true ^ e1VarC.f);
                    e1VarC.d = kVar;
                    e1VarC.b();
                    c0Var2.W.e.add(xVar);
                    c0Var2.P(c0Var2.W.getVideoSurface());
                    c0Var2.L(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    c0Var2.V();
                    if (holder2 == null) {
                        c0Var2.b();
                    } else {
                        c0Var2.E();
                        c0Var2.X = true;
                        c0Var2.V = holder2;
                        holder2.addCallback(xVar);
                        Surface surface2 = holder2.getSurface();
                        if (surface2 == null || !surface2.isValid()) {
                            c0Var2.P(null);
                            c0Var2.B(0, 0);
                        } else {
                            c0Var2.P(surface2);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            c0Var2.B(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            if (c0Var2.u(30)) {
                com.google.common.collect.h0 h0Var = c0Var2.m().a;
                boolean z = false;
                loop0: for (int i = 0; i < h0Var.size(); i++) {
                    if (((b1) h0Var.get(i)).b.c == 2) {
                        b1 b1Var = (b1) h0Var.get(i);
                        for (int i2 = 0; i2 < b1Var.d.length; i2++) {
                            if (b1Var.b(i2)) {
                                z = true;
                                break loop0;
                            }
                        }
                    }
                }
                if (z) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && c0Var2.u(28)) {
            c0Var2.V();
            subtitleView.setCues(c0Var2.d0.a);
        }
        androidx.media3.common.util.p pVar = c0Var2.m;
        d0Var.getClass();
        pVar.a(d0Var);
        setImageOutput(q0Var);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.y;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.V != i) {
            this.V = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.z;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        v vVar = this.I;
        vVar.getClass();
        vVar.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        v vVar = this.I;
        com.google.android.material.motion.a.q((z && vVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.Q == z) {
            return;
        }
        this.Q = z;
        if (p()) {
            vVar.setPlayer(this.P);
        } else if (vVar != null) {
            vVar.g();
            vVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.A;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(e0 e0Var) {
        if (e0Var != null) {
            setControllerVisibilityListener((u) null);
        }
    }
}
