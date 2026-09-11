package androidx.compose.ui.text.android;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements CharacterIterator {
    public final CharSequence e;
    public final int y;
    public int z = 0;

    public e(CharSequence charSequence, int i) {
        this.e = charSequence;
        this.y = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.z;
        if (i == this.y) {
            return (char) 65535;
        }
        return this.e.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.z = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.y;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.z;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.y;
        if (i == 0) {
            this.z = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.z = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.z + 1;
        this.z = i;
        int i2 = this.y;
        if (i < i2) {
            return this.e.charAt(i);
        }
        this.z = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.z;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.z = i2;
        return this.e.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.y || i < 0) {
            net.luminis.tls.engine.impl.c.o("invalid position");
            return (char) 0;
        }
        this.z = i;
        return current();
    }
}
