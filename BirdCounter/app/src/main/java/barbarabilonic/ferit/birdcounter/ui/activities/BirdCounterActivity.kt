package barbarabilonic.ferit.birdcounter.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer

import barbarabilonic.ferit.birdcounter.databinding.ActivityBirdCounterBinding
import barbarabilonic.ferit.birdcounter.ui.viewmodels.BirdCounterViewModel
import barbarabilonic.ferit.birdcounter.utilities.getBorder

import org.koin.androidx.viewmodel.ext.android.viewModel

class BirdCounterActivity : AppCompatActivity() {
    private val viewModel by viewModel<BirdCounterViewModel>()
    private lateinit var binding: ActivityBirdCounterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBirdCounterBinding.inflate(layoutInflater).apply {
            this.setLifecycleOwner(this@BirdCounterActivity)
            this.birdCountViewModel=viewModel
        }
        setContentView(binding.root)





        viewModel.color.observe(this, Observer{binding.tvBirdCount.setBackgroundResource(getBorder(it))})
    }





}