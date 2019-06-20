package com.bcarbonesi.marvelheroesvilains.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bcarbonesi.marvelheroesvilains.CharacterObject;
import com.bcarbonesi.marvelheroesvilains.R;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CharacterAdapter extends ArrayAdapter

{

    private Context context;
    private List<CharacterObject> characters;

    public CharacterAdapter (Context context, List<CharacterObject> list)
    {
        super(context, R.layout.character_list_view, list);
        this.context = context;
        this.characters = list;

    }

    @android.support.annotation.NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.character_list_view, parent, false);

        TextView textViewHeroesLV = convertView.findViewById(R.id.textViewHeroesLV);
        ImageView imageViewHeroesBackground = convertView.findViewById(R.id.imageViewHeroesBackground);

        return convertView;
    }
}
