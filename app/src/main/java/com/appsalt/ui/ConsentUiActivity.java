package com.appsalt.ui;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ConsentUiActivity extends Activity {
    public static final /* synthetic */ int e = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_consent);
        Bundle extras = getIntent().getExtras();
        Integer numValueOf = extras != null ? Integer.valueOf(extras.getInt("backgroundColor")) : null;
        Bundle extras2 = getIntent().getExtras();
        Integer numValueOf2 = extras2 != null ? Integer.valueOf(extras2.getInt("textColor")) : null;
        Bundle extras3 = getIntent().getExtras();
        Integer numValueOf3 = extras3 != null ? Integer.valueOf(extras3.getInt("buttonTextColor")) : null;
        Bundle extras4 = getIntent().getExtras();
        Integer numValueOf4 = extras4 != null ? Integer.valueOf(extras4.getInt("linksColor")) : null;
        Bundle extras5 = getIntent().getExtras();
        Integer numValueOf5 = extras5 != null ? Integer.valueOf(extras5.getInt("buttonBackgroundRes")) : null;
        if (numValueOf != null) {
            findViewById(R.id.root_layout).setBackgroundColor(numValueOf.intValue());
        }
        TextView textView = (TextView) findViewById(R.id.privacy_policy_text);
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue();
            Drawable drawable = ((ImageView) findViewById(R.id.hg_logo)).getDrawable();
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(numValueOf2.intValue(), PorterDuff.Mode.SRC_ATOP));
            }
            textView.setTextColor(iIntValue);
        }
        if (numValueOf4 != null) {
            textView.setLinkTextColor(numValueOf4.intValue());
        }
        Button button = (Button) findViewById(R.id.consent_button);
        Button button2 = (Button) findViewById(R.id.decline_button);
        if (numValueOf3 != null) {
            int iIntValue2 = numValueOf3.intValue();
            button.setTextColor(iIntValue2);
            button2.setTextColor(iIntValue2);
        }
        if (numValueOf5 != null) {
            int iIntValue3 = numValueOf5.intValue();
            button.setBackgroundResource(iIntValue3);
            button2.setBackgroundResource(iIntValue3);
        }
        Button button3 = (Button) findViewById(R.id.consent_button);
        button3.requestFocus();
        final int i = 0;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.appsalt.ui.a
            public final /* synthetic */ ConsentUiActivity y;

            {
                this.y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ConsentUiActivity consentUiActivity = this.y;
                switch (i2) {
                    case 0:
                        int i3 = ConsentUiActivity.e;
                        consentUiActivity.setResult(-1);
                        consentUiActivity.finish();
                        break;
                    default:
                        int i4 = ConsentUiActivity.e;
                        consentUiActivity.setResult(0);
                        consentUiActivity.finish();
                        break;
                }
            }
        });
        final int i2 = 1;
        ((Button) findViewById(R.id.decline_button)).setOnClickListener(new View.OnClickListener(this) { // from class: com.appsalt.ui.a
            public final /* synthetic */ ConsentUiActivity y;

            {
                this.y = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ConsentUiActivity consentUiActivity = this.y;
                switch (i3) {
                    case 0:
                        int i4 = ConsentUiActivity.e;
                        consentUiActivity.setResult(-1);
                        consentUiActivity.finish();
                        break;
                    default:
                        int i5 = ConsentUiActivity.e;
                        consentUiActivity.setResult(0);
                        consentUiActivity.finish();
                        break;
                }
            }
        });
        ((TextView) findViewById(R.id.privacy_policy_text)).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
