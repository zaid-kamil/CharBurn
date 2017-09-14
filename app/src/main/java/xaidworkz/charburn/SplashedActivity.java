package xaidworkz.charburn;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

public class SplashedActivity extends AwesomeSplash {


    @Override
    public void initSplash(ConfigSplash configSplash) {

        configSplash.setBackgroundColor(R.color.primary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(00); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP

        //Customize Logo
        configSplash.setLogoSplash(R.drawable.ic_cake_black_24dp); //or any other drawable
        configSplash.setAnimLogoSplashDuration(2000); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.BounceInDown);

        configSplash.setTitleSplash("Xaidworkz");
        configSplash.setTitleTextSize(50f); //float value
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FlipInX);

    }

    @Override
    public void animationsFinished() {
        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }
}
