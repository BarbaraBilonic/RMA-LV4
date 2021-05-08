package barbarabilonic.ferit.birdcounter.ui.viewmodels




import android.widget.TextView

import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import barbarabilonic.ferit.birdcounter.SharedPreferencesManager
import barbarabilonic.ferit.birdcounter.model.BirdCounter
import barbarabilonic.ferit.birdcounter.utilities.getBorder



class BirdCounterViewModel( private val birdCounter: BirdCounter) : ViewModel() {

        private val sharedPrefsManager = SharedPreferencesManager()

        private val _birdCount = MutableLiveData(birdCounter.birdCount)
        val birdCount: LiveData<Int> = _birdCount

        private val _color = MutableLiveData(birdCounter.color)
        val color: LiveData<Int> = _color






    init{
        birdCounter.setBirdCount(sharedPrefsManager.retrieveCount())
        birdCounter.setColor(sharedPrefsManager.retrieveColor())
        _birdCount.postValue(birdCounter.birdCount)
        _color.postValue(birdCounter.color)

    }




    fun birdSeen(c:Int){
        birdCounter.seeBird()
        birdCounter.setColor(c)
        _birdCount.postValue(birdCounter.birdCount)
        _color.postValue(birdCounter.color)

        sharedPrefsManager.saveData(birdCounter.birdCount,birdCounter.color)

    }

    fun reset(){
        birdCounter.reset()
        _birdCount.postValue(birdCounter.birdCount)
        _color.postValue(birdCounter.color)

        sharedPrefsManager.saveData(0,0)

    }







}