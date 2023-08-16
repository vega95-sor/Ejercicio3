package com.example.ejercicio32;

public class MyAdapter {
    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


        static class ViewHolder extends RecyclerView.ViewHolder {
            CardView cardView;

            ViewHolder(View itemView) {
                super(itemView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }
    }

}
