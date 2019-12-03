import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.joanzapata.iconify.IconDrawable;
import com.joanzapata.iconify.widget.IconTextView;
import com.sundram.urbanclapclone.R;



public class HomeScreen extends AppCompatActivity {
    IconTextView iconTextView;
Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen_toolbar);

    }
}
