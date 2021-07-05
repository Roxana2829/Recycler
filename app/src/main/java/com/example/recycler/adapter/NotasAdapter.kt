package com.example.recycler.adapter

import android.content.ClipDescription
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.modelo.Nota
import java.text.ParsePosition

class NotasAdapter(notas:ArrayList<Nota>, contexto:Context):RecyclerView.Adapter<NotasAdapter.ViewHolder>(){
    var notas:ArrayList<Nota>?=null
    var contexto:Context?=null

    init {
        this.notas = notas
        this.contexto = contexto
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotasAdapter.ViewHolder {
        val vistaNota:View = LayoutInflater.from(contexto).inflate(R.layout.notalayout,parent,false)
        val notaViewHolder = ViewHolder(vistaNota)
        vistaNota.tag = notaViewHolder
        return notaViewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitulo.text = notas!![position].titulo
        holder.tvTitulo.text = notas!![position].descripcion
    }

    override fun getItemCount(): Int {
        return this.notas!!.count()
    }

    class ViewHolder(v:View):RecyclerView.ViewHolder(v){
        lateinit var tvTitulo:TextView
        lateinit var tvDescription:TextView

        init {
            tvTitulo = v.findViewById(R.id.tvTitulo)
            tvDescription = v.findViewById(R.id.tvDescripcion)
        }

    }
}