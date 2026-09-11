package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.app.mlounge.emulator.LibretroCore;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final byte[] A;
    public static final byte[] B;
    public static final String[] C;
    public static final int[] D;
    public static final byte[] E;
    public static final d F;
    public static final d[][] G;
    public static final d[] H;
    public static final HashMap[] I;
    public static final HashMap[] J;
    public static final Set K;
    public static final HashMap L;
    public static final Charset M;
    public static final byte[] N;
    public static final byte[] O;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final int[] n;
    public static final int[] o;
    public static final byte[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;
    public c l;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        n = new int[]{8, 8, 8};
        o = new int[]{8};
        p = new byte[]{-1, -40, -1};
        q = new byte[]{102, 116, 121, 112};
        r = new byte[]{109, 105, 102, 49};
        s = new byte[]{104, 101, 105, 99};
        t = new byte[]{97, 118, 105, 102};
        u = new byte[]{97, 118, 105, 115};
        v = new byte[]{79, 76, 89, 77, 80, 0};
        w = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        x = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        y = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        z = new byte[]{82, 73, 70, 70};
        A = new byte[]{87, 69, 66, 80};
        B = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        C = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        D = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        E = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(LibretroCore.SCREEN_WIDTH, "ImageWidth", 3, 4), new d(257, "ImageLength", 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", LibretroCore.PSP_SCREEN_HEIGHT, 2), new d(273, "StripOffsets", 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, "RowsPerStrip", 3, 4), new d(279, "StripByteCounts", 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d(40962, "PixelXDimension", 3, 4), new d(40963, "PixelYDimension", 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize", 3, 4)};
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d(2, "GPSLatitude", 5, 10), new d("GPSLongitudeRef", 3, 2), new d(4, "GPSLongitude", 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d(LibretroCore.SCREEN_WIDTH, "ThumbnailImageWidth", 3, 4), new d(257, "ThumbnailImageLength", 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", LibretroCore.PSP_SCREEN_HEIGHT, 2), new d(273, "StripOffsets", 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d(278, "RowsPerStrip", 3, 4), new d(279, "StripByteCounts", 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d(50720, "DefaultCropSize", 3, 4)};
        F = new d("StripOffsets", 273, 3);
        G = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d("ThumbnailImage", LibretroCore.SCREEN_WIDTH, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        H = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        J = new HashMap[10];
        K = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        L = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        M = charsetForName;
        N = "Exif\u0000\u0000".getBytes(charsetForName);
        O = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = G;
            if (i >= dVarArr6.length) {
                HashMap map = L;
                d[] dVarArr7 = H;
                map.put(Integer.valueOf(dVarArr7[0].a), 5);
                map.put(Integer.valueOf(dVarArr7[1].a), 1);
                map.put(Integer.valueOf(dVarArr7[2].a), 2);
                map.put(Integer.valueOf(dVarArr7[3].a), 3);
                map.put(Integer.valueOf(dVarArr7[4].a), 7);
                map.put(Integer.valueOf(dVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i] = new HashMap();
            J[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                I[i].put(Integer.valueOf(dVar.a), dVar);
                J[i].put(dVar.b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00dd A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005e, blocks: (B:14:0x004f, B:16:0x0052, B:23:0x0067, B:29:0x0084, B:36:0x0097, B:42:0x00aa, B:39:0x009f, B:40:0x00a3, B:41:0x00a7, B:43:0x00b4, B:45:0x00bd, B:47:0x00c3, B:49:0x00c9, B:51:0x00cf, B:56:0x00dd), top: B:68:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public g(InputStream inputStream) throws IOException {
        d[][] dVarArr = G;
        this.d = new HashMap[dVarArr.length];
        this.e = new HashSet(dVarArr.length);
        this.f = ByteOrder.BIG_ENDIAN;
        boolean z2 = inputStream instanceof AssetManager.AssetInputStream;
        boolean z3 = m;
        if (z2) {
            this.b = (AssetManager.AssetInputStream) inputStream;
            this.a = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.b = null;
                this.a = fileInputStream.getFD();
            } catch (Exception unused) {
                if (z3) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.b = null;
                this.a = null;
            }
        } else {
            this.b = null;
            this.a = null;
        }
        for (int i = 0; i < dVarArr.length; i++) {
            try {
                try {
                    this.d[i] = new HashMap();
                } catch (IOException e) {
                    e = e;
                    if (z3) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z3) {
                        return;
                    }
                } catch (UnsupportedOperationException e2) {
                    e = e2;
                    if (z3) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    a();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                a();
                if (z3) {
                    p();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.c = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            b bVar = new b(bufferedInputStream);
            int i2 = this.c;
            if (i2 == 4) {
                e(bVar, 0, 0);
            } else if (i2 == 13) {
                h(bVar);
            } else if (i2 == 9) {
                i(bVar);
            } else if (i2 == 14) {
                l(bVar);
            }
        } else {
            f fVar = new f(bufferedInputStream);
            int i3 = this.c;
            if (i3 == 12 || i3 == 15) {
                d(fVar, i3);
            } else if (i3 == 7) {
                g(fVar);
            } else if (i3 == 10) {
                k(fVar);
            } else {
                j(fVar);
            }
            fVar.g(this.h);
            u(fVar);
        }
        a();
        if (!z3) {
            return;
        }
        p();
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s2 = bVar.readShort();
        boolean z2 = m;
        if (s2 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            net.luminis.tls.engine.impl.c.q(Integer.toHexString(s2), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat("\u0000").getBytes(M);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            int i = cVarC.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.a / eVar.b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.a / eVar2.b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.a / eVar3.b)));
            }
            boolean zContains = K.contains(str);
            ByteOrder byteOrder = this.f;
            if (!zContains) {
                return cVarC.f(byteOrder);
            }
            try {
                return Double.toString(cVarC.d(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        c cVar;
        int i;
        c cVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.c) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (cVar2 = this.l) != null)) {
            return cVar2;
        }
        for (int i2 = 0; i2 < G.length; i2++) {
            c cVar3 = (c) this.d[i2].get(str);
            if (cVar3 != null) {
                return cVar3;
            }
        }
        if (!"Xmp".equals(str) || (cVar = this.l) == null) {
            return null;
        }
        return cVar;
    }

    public final void d(f fVar, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            com.google.gson.b.r("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            com.google.gson.b.r("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata3), this.f));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", c.c(i2, this.f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.g(i5);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, N)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    fVar.readFully(bArr2);
                    this.h = i7;
                    r(bArr2, 0);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    fVar.g(j);
                    byte[] bArr3 = new byte[i10];
                    fVar.readFully(bArr3);
                    this.l = new c(j, bArr3, 1, i10);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
                throw th;
            } catch (IOException unused2) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:56:0x015f A[LOOP:0: B:10:0x0034->B:56:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00a2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00a5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a8. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void e(androidx.exifinterface.media.b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.g.e(androidx.exifinterface.media.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0144  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0176 A[LOOP:2: B:122:0x0168->B:127:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x017f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0186  */
    /* JADX WARN: Code duplicated, block: B:138:0x018f A[LOOP:3: B:133:0x0181->B:138:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x0199  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a3 A[LOOP:4: B:140:0x0194->B:145:0x01a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:174:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x018c A[EDGE_INSN: B:183:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01a6 A[EDGE_INSN: B:184:0x01a6->B:146:0x01a6 BREAK  A[LOOP:4: B:140:0x0194->B:145:0x01a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x018c A[EDGE_INSN: B:185:0x018c->B:137:0x018c BREAK  A[LOOP:3: B:133:0x0181->B:138:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b A[RETURN] */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i;
        b bVar2;
        int i2;
        b bVar3;
        b bVar4;
        int i3;
        b bVar5;
        b bVar6;
        int i4;
        int i5;
        byte[] bArr;
        int i6;
        int i7;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        b bVar7;
        short s2;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i9 = 0;
        while (true) {
            byte[] bArr5 = p;
            if (i9 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i9] != bArr5[i9]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i10 = 0; i10 < bytes.length; i10++) {
                    if (bArr4[i10] != bytes[i10]) {
                        int i11 = 1;
                        try {
                            bVar2 = new b(bArr4);
                            try {
                                try {
                                    long j2 = bVar2.readInt();
                                    byte[] bArr6 = new byte[4];
                                    bVar2.readFully(bArr6);
                                    if (Arrays.equals(bArr6, q)) {
                                        if (j2 == 1) {
                                            j2 = bVar2.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                                bVar2.close();
                                                i = 0;
                                                i2 = 0;
                                            }
                                        } else {
                                            j = 8;
                                        }
                                        i = 0;
                                        long j3 = 5000;
                                        if (j2 > j3) {
                                            j2 = j3;
                                        }
                                        long j4 = j2 - j;
                                        if (j4 >= 8) {
                                            try {
                                                byte[] bArr7 = new byte[4];
                                                long j5 = 0;
                                                boolean z2 = false;
                                                boolean z3 = false;
                                                boolean z4 = false;
                                                while (true) {
                                                    if (j5 < j4 / 4) {
                                                        try {
                                                            bVar2.readFully(bArr7);
                                                            if (j5 != 1) {
                                                                if (Arrays.equals(bArr7, r)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr7, s)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr7, t) || Arrays.equals(bArr7, u)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    bVar2.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    bVar2.close();
                                                                    i2 = 15;
                                                                }
                                                            }
                                                            j5++;
                                                        } catch (EOFException unused) {
                                                            bVar2.close();
                                                            i2 = i;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                                if (m) {
                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                }
                                                if (bVar2 != null) {
                                                }
                                                i2 = i;
                                                if (i2 != 0) {
                                                    return i2;
                                                }
                                                try {
                                                    bVar4 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderQ = q(bVar4);
                                                        this.f = byteOrderQ;
                                                        bVar4.z = byteOrderQ;
                                                        s2 = bVar4.readShort();
                                                        if (s2 != 20306) {
                                                            i3 = 1;
                                                        } else {
                                                            i3 = 1;
                                                        }
                                                        bVar4.close();
                                                    } catch (Exception unused2) {
                                                        if (bVar4 != null) {
                                                            bVar4.close();
                                                        }
                                                        i3 = i;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        bVar3 = bVar4;
                                                        if (bVar3 != null) {
                                                            bVar3.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused3) {
                                                    bVar4 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    bVar3 = null;
                                                }
                                                if (i3 != 0) {
                                                    return 7;
                                                }
                                                try {
                                                    bVar7 = new b(bArr4);
                                                    try {
                                                        ByteOrder byteOrderQ2 = q(bVar7);
                                                        this.f = byteOrderQ2;
                                                        bVar7.z = byteOrderQ2;
                                                        if (bVar7.readShort() == 85) {
                                                            i4 = 1;
                                                        } else {
                                                            i4 = i;
                                                        }
                                                        bVar7.close();
                                                    } catch (Exception unused4) {
                                                        bVar6 = bVar7;
                                                        if (bVar6 != null) {
                                                            bVar6.close();
                                                        }
                                                        i4 = i;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        bVar5 = bVar7;
                                                        if (bVar5 != null) {
                                                            bVar5.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception unused5) {
                                                    bVar6 = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    bVar5 = null;
                                                }
                                                if (i4 != 0) {
                                                    return 10;
                                                }
                                                i5 = i;
                                                while (true) {
                                                    bArr = x;
                                                    if (i5 < bArr.length) {
                                                        i6 = 1;
                                                        break;
                                                    }
                                                    if (bArr4[i5] != bArr[i5]) {
                                                        i6 = i;
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                                if (i6 != 0) {
                                                    return 13;
                                                }
                                                i7 = i;
                                                while (true) {
                                                    bArr2 = z;
                                                    if (i7 < bArr2.length) {
                                                        i8 = i;
                                                        while (true) {
                                                            bArr3 = A;
                                                            if (i8 >= bArr3.length) {
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                                                break;
                                                            }
                                                            i8++;
                                                        }
                                                        if (i11 != 0) {
                                                            return 14;
                                                        }
                                                        return i;
                                                    }
                                                    if (bArr4[i7] != bArr2[i7]) {
                                                        break;
                                                    }
                                                    i7++;
                                                }
                                                i11 = i;
                                                if (i11 != 0) {
                                                    return 14;
                                                }
                                                return i;
                                            }
                                        }
                                        bVar2.close();
                                        i2 = i;
                                    } else {
                                        bVar2.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    bVar = bVar2;
                                    if (bVar != null) {
                                        bVar.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = 0;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            i = 0;
                            bVar2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            bVar = null;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        bVar4 = new b(bArr4);
                        ByteOrder byteOrderQ3 = q(bVar4);
                        this.f = byteOrderQ3;
                        bVar4.z = byteOrderQ3;
                        s2 = bVar4.readShort();
                        if (s2 != 20306 || s2 == 21330) {
                            i3 = 1;
                        } else {
                            i3 = i;
                        }
                        bVar4.close();
                        if (i3 != 0) {
                            return 7;
                        }
                        bVar7 = new b(bArr4);
                        ByteOrder byteOrderQ4 = q(bVar7);
                        this.f = byteOrderQ4;
                        bVar7.z = byteOrderQ4;
                        if (bVar7.readShort() == 85) {
                            i4 = 1;
                        } else {
                            i4 = i;
                        }
                        bVar7.close();
                        if (i4 != 0) {
                            return 10;
                        }
                        i5 = i;
                        while (true) {
                            bArr = x;
                            if (i5 < bArr.length) {
                                i6 = 1;
                                break;
                            }
                            if (bArr4[i5] != bArr[i5]) {
                                i6 = i;
                                break;
                            }
                            i5++;
                        }
                        if (i6 != 0) {
                            return 13;
                        }
                        i7 = i;
                        while (true) {
                            bArr2 = z;
                            if (i7 < bArr2.length) {
                                i8 = i;
                                while (true) {
                                    bArr3 = A;
                                    if (i8 >= bArr3.length) {
                                        break;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i8 + 4] != bArr3[i8]) {
                                        break;
                                        break;
                                    }
                                    i8++;
                                }
                                if (i11 != 0) {
                                    return 14;
                                }
                                return i;
                            }
                            if (bArr4[i7] != bArr2[i7]) {
                                break;
                                break;
                            }
                            i7++;
                        }
                        i11 = i;
                        if (i11 != 0) {
                            return 14;
                        }
                        return i;
                    }
                }
                return 9;
            }
            i9++;
        }
    }

    public final void g(f fVar) throws IOException {
        int i;
        int i2;
        j(fVar);
        HashMap[] mapArr = this.d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.z = this.f;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.g(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.g(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.g(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                c cVarC = c.c(i5, this.f);
                c cVarC2 = c.c(i6, this.f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.z = ByteOrder.BIG_ENDIAN;
        int i = bVar.y;
        bVar.a(x.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                return;
            }
            try {
                int i2 = bVar.readInt();
                int i3 = bVar.readInt();
                int i4 = bVar.y;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z2) {
                    this.h = i6;
                    byte[] bArr = new byte[i2];
                    bVar.readFully(bArr);
                    int i7 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    r(bArr, 0);
                    x();
                    u(new b(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = y;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = bVar.y - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            bVar.readFully(bArr4);
                            this.l = new c(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                bVar.a(i5 - bVar.y);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.a(i - bVar.y);
        bVar.readFully(bArr4);
        e(new b(bArr4), i, 5);
        bVar.a(i3 - bVar.y);
        bVar.z = ByteOrder.BIG_ENDIAN;
        int i4 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == F.a) {
                short s2 = bVar.readShort();
                short s3 = bVar.readShort();
                c cVarC = c.c(s2, this.f);
                c cVarC2 = c.c(s3, this.f);
                HashMap[] mapArr = this.d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s2) + ", width: " + ((int) s3));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.c == 8) {
            HashMap[] mapArr = this.d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.z = this.f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.d), (int) cVar.c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.z = ByteOrder.LITTLE_ENDIAN;
        bVar.a(z.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = A;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(B, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = N;
                    if (android.support.v4.media.session.b.K(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.h = i3;
                    r(bArrCopyOfRange, 0);
                    u(new b(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        if (this.c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.b == null && this.a == null) {
            bVar.a(iE);
            bVar.readFully(new byte[iE2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f) <= 512 && cVar2.e(this.f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f = byteOrderQ;
        fVar.z = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            net.luminis.tls.engine.impl.c.q(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = fVar.readInt();
        if (i2 < 8) {
            net.luminis.tls.engine.impl.c.t(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            fVar.a(i3);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbV = androidx.privacysandbox.ads.adservices.java.internal.a.v("The size of tag group[", i, "]: ");
            sbV.append(mapArr[i].size());
            Log.d("ExifInterface", sbV.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f) + "'");
            }
            i++;
        }
    }

    public final void r(byte[] bArr, int i) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0301  */
    /* JADX WARN: Code duplicated, block: B:148:0x032b  */
    /* JADX WARN: Code duplicated, block: B:175:0x032e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    public final void s(f fVar, int i) throws IOException {
        HashMap[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strG;
        int i3;
        int i4 = fVar.y;
        int i5 = fVar.B;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.e;
        hashSet2.add(numValueOf);
        short s2 = fVar.readShort();
        boolean z3 = m;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s2));
        }
        if (s2 <= 0) {
            return;
        }
        short s3 = 0;
        while (true) {
            mapArr = this.d;
            if (s3 >= s2) {
                break;
            }
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i6 = fVar.readInt();
            long j6 = ((long) fVar.y) + 4;
            short s4 = s2;
            d dVar = (d) I[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), dVar != null ? dVar.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (dVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = D;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = dVar.c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = dVar.d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + C[unsignedShort3] + ") is unexpected for tag: " + dVar.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = fVar.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.c == 7) {
                                if ("MakerNote".equals(dVar.b)) {
                                    this.i = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(dVar.b)) {
                                    this.j = i3;
                                    this.k = i6;
                                    c cVarC = c.c(6, this.f);
                                    c cVarA = c.a(this.j, this.f);
                                    c cVarA2 = c.a(this.k, this.f);
                                    mapArr[4].put("Compression", cVarC);
                                    mapArr[4].put("JPEGInterchangeFormat", cVarA);
                                    mapArr[4].put("JPEGInterchangeFormatLength", cVarA2);
                                }
                            }
                            fVar.g(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            dVar = dVar;
                        }
                        num = (Integer) L.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) fVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                        if (i5 != -1) {
                                            strG = strG + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strG);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        fVar.g(j5);
                                        s(fVar, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                fVar.g(j3);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            }
                            fVar.g(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = fVar.y + this.h;
                            byte[] bArr = new byte[(int) j2];
                            fVar.readFully(bArr);
                            c cVar = new c(i8, bArr, unsignedShort3, i6);
                            HashMap map = mapArr[i];
                            str = dVar.b;
                            map.put(str, cVar);
                            if ("DNGVersion".equals(str)) {
                                this.c = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && cVar.f(this.f).contains("PENTAX")) || ("Compression".equals(str) && cVar.e(this.f) == 65535)) {
                                this.c = 8;
                            }
                            if (fVar.y != j4) {
                                fVar.g(j4);
                            }
                        }
                    } else {
                        fVar.g(j);
                        hashSet = hashSet2;
                    }
                    s3 = (short) (s3 + 1);
                    hashSet2 = hashSet;
                    s2 = s4;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    fVar.g(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = fVar.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.c == 7) {
                            if ("MakerNote".equals(dVar.b)) {
                                this.i = i3;
                            } else if (i != 6) {
                            }
                        }
                        fVar.g(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        dVar = dVar;
                    }
                    num = (Integer) L.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) fVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                    if (i5 != -1) {
                                        strG = strG + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strG);
                                }
                            }
                            fVar.g(j3);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        }
                        fVar.g(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = fVar.y + this.h;
                        byte[] bArr2 = new byte[(int) j2];
                        fVar.readFully(bArr2);
                        c cVar2 = new c(i9, bArr2, unsignedShort3, i6);
                        HashMap map2 = mapArr[i];
                        str = dVar.b;
                        map2.put(str, cVar2);
                        if ("DNGVersion".equals(str)) {
                            this.c = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.c = 8;
                        if (fVar.y != j4) {
                            fVar.g(j4);
                        }
                    }
                }
                s3 = (short) (s3 + 1);
                hashSet2 = hashSet;
                s2 = s4;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                fVar.g(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = fVar.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.c == 7) {
                        if ("MakerNote".equals(dVar.b)) {
                            this.i = i3;
                        } else if (i != 6) {
                        }
                    }
                    fVar.g(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    dVar = dVar;
                }
                num = (Integer) L.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) fVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                                if (i5 != -1) {
                                    strG = strG + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strG);
                            }
                        }
                        fVar.g(j3);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), dVar.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strG = strG + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strG);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strG = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.g("Skip jump into the IFD since its offset is invalid: ", j5);
                            if (i5 != -1) {
                                strG = strG + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strG);
                        }
                    }
                    fVar.g(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = fVar.y + this.h;
                    byte[] bArr3 = new byte[(int) j2];
                    fVar.readFully(bArr3);
                    c cVar3 = new c(i10, bArr3, unsignedShort3, i6);
                    HashMap map3 = mapArr[i];
                    str = dVar.b;
                    map3.put(str, cVar3);
                    if ("DNGVersion".equals(str)) {
                        this.c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.c = 8;
                    if (fVar.y != j4) {
                        fVar.g(j4);
                    }
                }
            }
            s3 = (short) (s3 + 1);
            hashSet2 = hashSet;
            s2 = s4;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i11 = fVar.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        fVar.g(j7);
        if (mapArr[4].isEmpty()) {
            s(fVar, 4);
        } else if (mapArr[5].isEmpty()) {
            s(fVar, 5);
        }
    }

    public final void t(String str, int i, String str2) {
        HashMap[] mapArr = this.d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (c) map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f);
            int[] iArr2 = n;
            if (Arrays.equals(iArr2, iArr) || (this.c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f)) == 1 && Arrays.equals(iArr, o)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrI = android.support.v4.media.session.b.i(cVar4.g(this.f));
                long[] jArrI2 = android.support.v4.media.session.b.i(cVar5.g(this.f));
                if (jArrI == null || jArrI.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrI2 == null || jArrI2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrI.length != jArrI2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrI2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.g = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrI.length; i3++) {
                    int i4 = (int) jArrI[i3];
                    int i5 = (int) jArrI2[i3];
                    if (i3 < jArrI.length - 1 && i4 + i5 != jArrI[i3 + 1]) {
                        this.g = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar.a(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        try {
                            bVar.readFully(bArr2);
                            i = i7 + i5;
                            System.arraycopy(bArr2, 0, bArr, i2, i5);
                            i2 += i5;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                }
                if (this.g) {
                    long j3 = jArrI[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i2) {
        HashMap[] mapArr = this.d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = m;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i].get("ImageLength");
        c cVar2 = (c) mapArr[i].get("ImageWidth");
        c cVar3 = (c) mapArr[i2].get("ImageLength");
        c cVar4 = (c) mapArr[i2].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f);
        int iE2 = cVar2.e(this.f);
        int iE3 = cVar3.e(this.f);
        int iE4 = cVar4.e(this.f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void w(f fVar, int i) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.d;
        c cVar = (c) mapArr[i].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            int i2 = cVar.a;
            ByteOrder byteOrder = this.f;
            if (i2 == 5) {
                e[] eVarArr = (e[]) cVar.g(byteOrder);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f);
                cVarC2 = c.b(eVarArr[1], this.f);
            } else {
                int[] iArr = (int[]) cVar.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f);
                cVarC2 = c.c(iArr[1], this.f);
            }
            mapArr[i].put("ImageWidth", cVarC);
            mapArr[i].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f);
            int iE2 = cVar4.e(this.f);
            int iE3 = cVar5.e(this.f);
            int iE4 = cVar3.e(this.f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f);
            c cVarC4 = c.c(iE3 - iE4, this.f);
            mapArr[i].put("ImageLength", cVarC3);
            mapArr[i].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i].get("ImageLength");
        c cVar7 = (c) mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f);
            int iE6 = cVar8.e(this.f);
            fVar.g(iE5);
            byte[] bArr = new byte[iE6];
            fVar.readFully(bArr);
            e(new b(bArr), iE5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t("ThumbnailOrientation", 0, "Orientation");
        t("ThumbnailImageLength", 0, "ImageLength");
        t("ThumbnailImageWidth", 0, "ImageWidth");
        t("ThumbnailOrientation", 5, "Orientation");
        t("ThumbnailImageLength", 5, "ImageLength");
        t("ThumbnailImageWidth", 5, "ImageWidth");
        t("Orientation", 4, "ThumbnailOrientation");
        t("ImageLength", 4, "ThumbnailImageLength");
        t("ImageWidth", 4, "ThumbnailImageWidth");
    }
}
