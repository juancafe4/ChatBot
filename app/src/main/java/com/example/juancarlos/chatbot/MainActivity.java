package com.example.juancarlos.chatbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mListMessages;
    private EditText mMessageField;
    private ImageButton mSendButton;
    private int count = 0;
    public static ArrayList<ChatMessage> chatList;
    public static ChatAdapter chatAdapter;
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

        chatList = new ArrayList<ChatMessage>();
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
            final ChatMessage chatMessage = new ChatMessage(message + "\n", "14:55", isUser);

            mMessageField.setText("");
            chatAdapter.add(chatMessage);
            chatAdapter.notifyDataSetChanged();
        }
    }
}
