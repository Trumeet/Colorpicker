package moe.yuuta.colorpickerapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import com.android.colorpicker.ColorPickerDialog;
import com.android.colorpicker.ColorPickerSwatch;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ColorPickerDialog dialog = ColorPickerDialog.newInstance(R.string.app_name,
                new int[]{Color.WHITE, Color.BLACK, Color.GRAY},
                Color.WHITE,
                3,
                ColorPickerDialog.SIZE_SMALL);
        dialog.setOnColorSelectedListener(new ColorPickerSwatch.OnColorSelectedListener() {
            @Override
            public void onColorSelected(int color) {
                Toast.makeText(MainActivity.this, "Selected " + color, Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show(getSupportFragmentManager(), "Picker");
    }
}
