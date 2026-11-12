package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Word
import java.util.LinkedList

class WordListAdapter(private val wordList: LinkedList<Word>) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {
    inner class WordViewHolder(itemView: View, val adapter: WordListAdapter) :
        RecyclerView.ViewHolder(itemView) {
        val wordItemView: TextView = itemView.findViewById(R.id.word_title)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.wordlist_item, parent, false)

        return WordViewHolder(adapterLayout, this)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = wordList[position]
        holder.wordItemView.text = current.word
    }

    override fun getItemCount(): Int = wordList.size

}
