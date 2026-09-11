package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class y extends ImageView {
    public final o e;
    public final x y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, int i) {
        super(context, null, i);
        z1.a(context);
        this.z = false;
        y1.a(this, getContext());
        o oVar = new o(this);
        this.e = oVar;
        oVar.f(null, i);
        x xVar = new x(this);
        this.y = xVar;
        xVar.o(null, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.e;
        if (oVar != null) {
            oVar.b();
        }
        x xVar = this.y;
        if (xVar != null) {
            xVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.e;
        if (oVar != null) {
            return oVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        a2 a2Var;
        x xVar = this.y;
        if (xVar == null || (a2Var = (a2) xVar.A) == null) {
            return null;
        }
        return (ColorStateList) a2Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        a2 a2Var;
        x xVar = this.y;
        if (xVar == null || (a2Var = (a2) xVar.A) == null) {
            return null;
        }
        return (PorterDuff.Mode) a2Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.y.z).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.e;
        if (oVar != null) {
            oVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.e;
        if (oVar != null) {
            oVar.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x xVar = this.y;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        x xVar = this.y;
        if (xVar != null && drawable != null && !this.z) {
            xVar.y = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xVar != null) {
            xVar.d();
            if (this.z) {
                return;
            }
            ImageView imageView = (ImageView) xVar.z;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xVar.y);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.z = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        x xVar = this.y;
        if (xVar != null) {
            ImageView imageView = (ImageView) xVar.z;
            if (i != 0) {
                Drawable drawableP = coil3.network.g.p(imageView.getContext(), i);
                if (drawableP != null) {
                    t0.a(drawableP);
                }
                imageView.setImageDrawable(drawableP);
            } else {
                imageView.setImageDrawable(null);
            }
            xVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x xVar = this.y;
        if (xVar != null) {
            xVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.e;
        if (oVar != null) {
            oVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x xVar = this.y;
        if (xVar != null) {
            if (((a2) xVar.A) == null) {
                xVar.A = new a2();
            }
            a2 a2Var = (a2) xVar.A;
            a2Var.c = colorStateList;
            a2Var.b = true;
            xVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x xVar = this.y;
        if (xVar != null) {
            if (((a2) xVar.A) == null) {
                xVar.A = new a2();
            }
            a2 a2Var = (a2) xVar.A;
            a2Var.d = mode;
            a2Var.a = true;
            xVar.d();
        }
    }
}
