package com.franktan.androidportfolio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.franktan.androidportfolio.model.Project;

/**
 * Created by Frank Tan on 21/07/2015.
 */
public class ProjectAdapter extends ArrayAdapter<Project> {
    private Project[] mDataset;
    private Context mContext;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder {
        // each data item is just a string in this case
        public TextView mProjName, mProjDesc;
        public ImageView mProjImage;
        public ViewHolder(View view) {
            mProjName = (TextView) view.findViewById(R.id.project_name);
            mProjDesc = (TextView) view.findViewById(R.id.project_description);
            mProjImage = (ImageView) view.findViewById(R.id.project_image);
        }
    }

    // Provide a suitable constructor
    public ProjectAdapter(Context context, Project[] projectDataset) {
        super(context, -1, projectDataset);
        mDataset = projectDataset;
        mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.project_card, parent, false);

            // Creates a ViewHolder and store references to
            // the two children views we want to bind data to.
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.mProjName.setText(mDataset[position].getmName());
        viewHolder.mProjDesc.setText(mDataset[position].getmDescription());
        viewHolder.mProjImage.setImageResource(mDataset[position].getmImage());

        return convertView;
    }
}
