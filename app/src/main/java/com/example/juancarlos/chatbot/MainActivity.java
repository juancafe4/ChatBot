package com.example.juancarlos.chatbot;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private ListView mListMessages;
    private EditText mMessageField;
    private ImageButton mSendButton;
    private int count = 0;
    public static ArrayList<ChatMessage> chatList;
    public static ChatAdapter chatAdapter;

    private static DateFormat timeFormat = new SimpleDateFormat("HH:mma");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListMessages = (ListView) findViewById(R.id.message_list);
        mMessageField = (EditText) findViewById(R.id.message_edit);
        mSendButton = (ImageButton) findViewById(R.id.send_btn);

        mSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendTextMessage();
            }
        });

        // ----Set autoscroll of listview when a new message arrives----//
        mListMessages.setTranscriptMode(ListView.TRANSCRIPT_MODE_ALWAYS_SCROLL);
        mListMessages.setStackFromBottom(true);
        mListMessages.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
                Log.i("SCROLLING", String.valueOf(i));
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
            }
        });

        chatList = new ArrayList<ChatMessage>();

        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));

        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatList.add(new ChatMessage("Test test test", "13:56", true));
        chatList.add(new ChatMessage("Test test test", "13:56", false));
        chatAdapter = new ChatAdapter(this, chatList);

        mListMessages.setAdapter(chatAdapter);
    }

    private void sendTextMessage() {
        String message = mMessageField.getText().toString();

        if (!message.equalsIgnoreCase("")) {
            boolean isUser = false;
            if (count % 2 == 0) {
                isUser = true;
            }
            count++;

            if (message.length() <= 20) {
                int extraSpaces = 20 - message.length();
                message = addExtraSpaces(message, extraSpaces);
            }
            final ChatMessage chatMessage = new ChatMessage(message + "\n", getCurrentTime(), isUser);

            mMessageField.setText("");
            chatAdapter.add(chatMessage);
            chatAdapter.notifyDataSetChanged();
        }
    }

    private String addExtraSpaces(String msg, int numSpaces) {
        for (int i = 0; i < numSpaces; i++) {
            msg += " ";
        }
        return msg;
    }

    public static String getCurrentTime() {
        Date today = Calendar.getInstance().getTime();
        return timeFormat.format(today);
    }


}
