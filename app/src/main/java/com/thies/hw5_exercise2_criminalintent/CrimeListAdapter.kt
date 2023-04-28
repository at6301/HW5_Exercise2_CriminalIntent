package com.thies.hw5_exercise2_criminalintent

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thies.hw5_exercise2_criminalintent.databinding.ListItemCrimeBinding

class CrimeHolder(private val binding: ListItemCrimeBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(crime: Crime) {
        binding.crimeTitle.text = crime.title
        binding.crimeDate.text = crime.date.toString()
    }
}

// sits in between RecyclerView and data set; RecyclerView does not know anything about Crimes
class CrimeListAdapter(private val crimes: List<Crime>) : RecyclerView.Adapter<CrimeHolder>() {

    // creates a binding to display, wraps it in view holder, and returns the result in a new instance of CrimeHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrimeHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemCrimeBinding.inflate(inflater, parent, false)
        return CrimeHolder(binding)
    }
    // populates holder with crime from given position
    override fun onBindViewHolder(holder: CrimeHolder, position: Int) {
        val crime = crimes[position]
        /*holder.apply {
            // set text from given crime in corresponding text views
            binding.crimeTitle.text = crime.title
            binding.crimeDate.text = crime.date.toString()
        }*/
        holder.bind(crime)
    }

    override fun getItemCount() = crimes.size
}