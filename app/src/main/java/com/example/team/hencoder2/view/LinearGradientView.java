package com.example.team.hencoder2.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LightingColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.team.hencoder2.R;

/**
 * Created by Team丶长相守 on 2017/12/29.
 */

public class LinearGradientView  extends View{

    private Paint paint;
    public LinearGradientView(Context context) {
        this(context,null);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LinearGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();

        //setLayerType(LAYER_TYPE_SOFTWARE,null);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



// ComposeShader：结合两个 Shader
   /*     Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.boc);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);


        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.bank_info);
        Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Shader commShader = new ComposeShader(shader1,shader2, PorterDuff.Mode.SRC_OVER);
        paint.setShader(commShader);
        canvas.drawCircle(300,300,150,paint);
        //canvas.drawRect(300,1200,800,1600,paint);*/

// ComposeShader：结合两个 Shader
        // 第一个 Shader：头像的 Bitmap
/*       Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
        Shader shader1 = new BitmapShader(bitmap1, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

// 第二个 Shader：从上到下的线性渐变（由透明到黑色）
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.batman_logo);
        Shader shader2 = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Shader shader = new ComposeShader(shader1, shader2, PorterDuff.Mode.SRC_OVER);
        paint.setShader(shader);
        //canvas.drawCircle(300, 300, 300, paint);
        canvas.drawRect(300,300,687,676,paint);*/



//ColorFilter
      /*  ColorFilter lightingColorFilter = new LightingColorFilter(0xffffff,0x003000);
        paint.setColorFilter(lightingColorFilter);
        Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.boc);
        Shader btShader = new BitmapShader(bm,Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        paint.setShader(btShader);
        canvas.drawRect(300,300,900,1800,paint);*/


      int saved =canvas.saveLayer(null,null,Canvas.ALL_SAVE_FLAG);
        Xfermode xfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.circle);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(),R.drawable.rect);
        canvas.drawBitmap(bitmap2,0,0,paint);
        paint.setXfermode(xfermode);
        canvas.drawBitmap(bitmap1,0,0,paint);
        paint.setXfermode(null);

       /*
        canvas.drawBitmap(bitmap1,300,300,paint);
        paint.setXfermode(null);*/

        canvas.restoreToCount(saved);
    }

}
