package com.example.appnew;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Noticias#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Noticias extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Noticias() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Noticias.
     */
    // TODO: Rename and change types and number of parameters
    public static Noticias newInstance(String param1, String param2) {
        Noticias fragment = new Noticias();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    RecyclerView recyclerView;
    String n1[], n2[];
    int nimage[]={R.drawable.noticia1,R.drawable.noticia2,R.drawable.noticia3};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_noticias, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Noticias");

        recyclerView = view.findViewById(R.id.recyclerViewnoticias);

        n1 = getResources().getStringArray(R.array.titulonoticia);
        n2 = getResources().getStringArray(R.array.descripcionnoticia);
        Adapternoticias adapternoticias = new Adapternoticias(getActivity(),n1,n2,nimage);
        recyclerView.setAdapter(adapternoticias);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));



        return view;
    }
}