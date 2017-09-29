package com.example.juancarlos.chatbot;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.daasuu.bl.ArrowDirection;
import com.daasuu.bl.BubbleLayout;

import java.util.ArrayList;

/**
 * Created by juancarlos on 9/28/17.
 */
public class ChatAdapter extends BaseAdapter {
    private static LayoutInflater inflater = null;
    public ArrayList<ChatMessage> chatMessageList;

    public ChatAdapter(Activity activity, ArrayList<ChatMessage> list) {
        chatMessageList = list;
        inflater = (LayoutInflater) activity
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return chatMessageList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)  {
        ChatMessage message = (ChatMessage) chatMessageList.get(position);

        View vi = convertView;
//        if (convertView == null) {
//            vi = inflater.inflate(R.layout.bot_message, null);
//        }


        if (message.getIsUser()) {
            vi = inflater.inflate(R.layout.user_message, null);
            TextView mMessage = (TextView) vi.findViewById(R.id.user_body);
            TextView mDate = (TextView) vi.findViewById(R.id.user_date);
            mMessage.setText(message.getMessage());
            mDate.setText(message.getDate());
        } else {
            vi = inflater.inflate(R.layout.bot_message, null);
            TextView mMessage = (TextView) vi.findViewById(R.id.bot_body);
            TextView mDate = (TextView) vi.findViewById(R.id.bot_date);
            mMessage.setText(message.getMessage());
            mDate.setText(message.getDate());
        }

        return vi;
    }

    public void add(ChatMessage object) {
        chatMessageList.add(object);
    }
}
