package Noodles;

import android.app.NativeActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.R;

import java.util.List;

public class NoodlesAdapter extends RecyclerView.Adapter<NoodlesAdapter.ViewHolder> {

    private List<Noodles> mNoodlesList;
    Context context;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView noodlesImage;
        TextView noodlesName;
        TextView noodlesRecommend;
        View noodlesView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            noodlesView = itemView;
            noodlesImage = itemView.findViewById(R.id.noodles_image);
            noodlesName = itemView.findViewById(R.id.noodles_text_name);
            noodlesRecommend = itemView.findViewById(R.id.noodles_text_recommend);
        }
    }

    public NoodlesAdapter(List<Noodles> noodlesList) {
        mNoodlesList = noodlesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        holder.noodlesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                Noodles noodles = mNoodlesList.get(position);
                Intent intent = new Intent(context, JianjieActivity.class);
                context.startActivity(intent);
            }
        });
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Noodles noodles = mNoodlesList.get(position);
        holder.noodlesImage.setImageResource(noodles.getImageId());
        holder.noodlesName.setText(noodles.getName());
        holder.noodlesRecommend.setText(noodles.getRecommend());
    }

    @Override
    public int getItemCount() {
        return mNoodlesList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public void getContext (Context context) {
        this.context = context;
    }
}
