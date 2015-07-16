package gdg.wellington.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

import gdg.wellington.databinding.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    String[] names = {"Anne", "Bette", "Cate",
            "Dawn", "Elise", "Faye", "Ginger",
            "Harriot", "Izzy", "Jane", "Kaye",
            "Liz", "Maria", "Nell", "Olive",
            "Pat", "Queenie", "Rae", "Sal",
            "Tam", "Uma", "Violet", "Wilma",
            "Xana", "Yvonne", "Zelda",
            "Abe", "Billy", "Caleb", "Davie",
            "Eb", "Frank", "Gabe", "House",
            "Icarus", "Jack", "Kurt", "Larry",
            "Mike", "Nolan", "Oliver", "Pat",
            "Quib", "Roy", "Sal", "Tom",
            "Ube", "Val", "Walt", "Xavier",
            "Yvan", "Zeb"};
    String[] appellations = {"Awesome", "Captain",
            "Even", "Fighter", "Great", "Hearty",
            "Jackal", "King", "Lord", "Mighty",
            "Noble", "Old", "Powerful", "Quick",
            "Red", "Stalwart", "Tank", "Ultimate",
            "Vicious", "Wily", "aXe", "Young",
            "Brave", "Eager", "Kind", "Sandy",
            "Xeric", "Yellow", "Zesty"};

    private ActivityMainBinding binding;

    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void onClickNewNameButton(View view) {
        String name = names[random.nextInt(names.length)];
        String appellation = this.appellations[random.nextInt(this.appellations.length)];

        Pirate pirate = new Pirate(name, appellation);
        binding.setPirate(pirate);
    }

}