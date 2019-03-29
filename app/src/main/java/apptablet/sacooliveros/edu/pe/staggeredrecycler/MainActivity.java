package apptablet.sacooliveros.edu.pe.staggeredrecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int NUM_COLUMNS = 2;

    private ArrayList<String> mImagenUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();

    }

    private void initImageBitmaps() {
        Log.d(TAG, " inititBitmpas: prepare bitmaps.");

        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJPCJKP8tL2tOzp1nsTMurItTkKrC29orf5Lmxt5162wImThlB");
        mNames.add("Solucionario UNI 1");

        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlTiURvhn9b7yig4D-jSXwUeamLxv5DjOWb7dLYn3JaTrJpUvc");
        mNames.add("Solucionario UNI 3");


        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT4tuhaP8zm-7AQNUk4bNJavKXsjlb7JviL3gotgFJWobCDUUg3_g");
        mNames.add("Solucionario SM 4");


        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbjgosOMGzq62IBT0kr_QVHHw5nBqRjpXTr62Vs-YHzU9iwSSq");
        mNames.add("Solucionario SM 5");

        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdBFxuuc4_aq4vBKQbV0kMSbrDMLptD9bRSJrxLCTAWKojGC-p");
        mNames.add("Solucionario SM 2");


        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRL6n88850WySE6yK2vsWZJFsTjX6WSVLPB2QfeAy_qZm0o4SM1");
        mNames.add("Solucionario UNI 6");


        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSncXY86SM05t1iPFsifrVF-S5ttpy3UEt2HlPqZQ2Gwh5I8EE2");
        mNames.add("Solucionario UNI 7");

        mImagenUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWQ25sj4yJLqngvFg_r2u-hhtVQ8jbFAg_R39SDN63Iq_IfcYK");
        mNames.add("Solucionario SM 8");

        initRecyclerView();
    }


    private void initRecyclerView()

    {

        Log.d(TAG, "initRecyclerView : initializing staggered recyclerview");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        StaggeredRecyclerViewAdapter staggeredRecyclerViewAdapter = new StaggeredRecyclerViewAdapter(this, mNames, mImagenUrls);


        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(staggeredRecyclerViewAdapter);
    }
}
