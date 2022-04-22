package com.invoice.calendarexample

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.invoice.calendarexample.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var dateSelected = Date()
    private lateinit var textViews: List<TextView>
    private var dates: List<Date> = listOf()
    private var stateMotion = false
    private var monthSelected: Int = 0
    private var yearSelected: Int = 0

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        textViews = listOf(
            binding.text01,
            binding.text02,
            binding.text03,
            binding.text04,
            binding.text05,
            binding.text06,
            binding.text07,
            binding.text08,
            binding.text09,
            binding.text10,
            binding.text11,
            binding.text12,
            binding.text13,
            binding.text14,
            binding.text15,
            binding.text16,
            binding.text17,
            binding.text18,
            binding.text19,
            binding.text20,
            binding.text21,
            binding.text22,
            binding.text23,
            binding.text24,
            binding.text25,
            binding.text26,
            binding.text27,
            binding.text28,
            binding.text29,
            binding.text30,
            binding.text31,
            binding.text32,
            binding.text33,
            binding.text34,
            binding.text35,
            binding.text36,
            binding.text37,
            binding.text38,
            binding.text39,
            binding.text40,
            binding.text41,
            binding.text42,
        )
        binding.motionBase.setTransitionDuration(1000)
        binding.text01.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[0]
        }
        binding.text02.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[1]
        }
        binding.text03.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[2]
        }
        binding.text04.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[3]
        }
        binding.text05.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[4]
        }
        binding.text06.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[5]
        }
        binding.text07.setOnClickListener {
            setTransition(R.id.start, R.id.to_first_constraint)
            dateSelected = dates[6]
        }
        binding.text08.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[7]
        }
        binding.text09.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[8]
        }
        binding.text10.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[9]
        }
        binding.text11.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[10]
        }
        binding.text12.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[11]
        }
        binding.text13.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[12]
        }
        binding.text14.setOnClickListener {
            setTransition(R.id.start, R.id.to_second_constraint)
            dateSelected = dates[13]
        }
        binding.text15.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[14]
        }
        binding.text16.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[15]
        }
        binding.text17.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[16]
        }
        binding.text18.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[17]
        }
        binding.text19.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[18]
        }
        binding.text20.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[19]
        }
        binding.text21.setOnClickListener {
            setTransition(R.id.start, R.id.to_third_constraint)
            dateSelected = dates[20]
        }
        binding.text22.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[21]
        }
        binding.text23.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[22]
        }
        binding.text24.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[23]
        }
        binding.text25.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[24]
        }
        binding.text26.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[25]
        }
        binding.text27.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[26]
        }
        binding.text28.setOnClickListener {
            setTransition(R.id.start, R.id.to_fourth_constraint)
            dateSelected = dates[27]
        }
        binding.text29.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[28]
        }
        binding.text30.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[29]
        }
        binding.text31.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[30]
        }
        binding.text32.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[31]
        }
        binding.text33.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[32]
        }
        binding.text34.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[33]
        }
        binding.text35.setOnClickListener {
            setTransition(R.id.start, R.id.to_fifth_constraint)
            dateSelected = dates[34]
        }
        binding.text36.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[35]
        }
        binding.text37.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[36]
        }
        binding.text38.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[37]
        }
        binding.text42.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[38]
        }
        binding.text39.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[39]
        }
        binding.text40.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[40]
        }
        binding.text41.setOnClickListener {
            setTransition(R.id.start, R.id.to_sixth_constraint)
            dateSelected = dates[41]
        }
        binding.more.setOnClickListener {
            stateMotion = if (stateMotion) {
                binding.motionBase.transitionToStart()
                false
            } else {
                binding.motionBase.transitionToEnd()
                true
            }
        }
        binding.navigateToNext.setOnClickListener {
            if (monthSelected == 12) {
                monthSelected = 1
                yearSelected++
            } else {
                monthSelected++
            }
            dates = getDatesOfMoth(monthSelected, yearSelected)
            setCalendar(dates)
        }
        binding.navigateToPrevious.setOnClickListener {
            if (monthSelected == 1) {
                monthSelected = 12
                yearSelected--
            } else {
                monthSelected--
            }
            dates = getDatesOfMoth(monthSelected, yearSelected)
            setCalendar(dates)
        }
        binding.navigateToSelected.setOnClickListener {
            monthSelected = SimpleDateFormat("MM").format(dateSelected).toInt()
            yearSelected = SimpleDateFormat("yyyy").format(dateSelected).toInt()
            dates = getDatesOfMoth(this.monthSelected, this.yearSelected)
            setCalendar(dates)
            stateMotion = if (stateMotion) {
                binding.motionBase.transitionToStart()
                false
            } else {
                binding.motionBase.transitionToEnd()
                true
            }
        }
        monthSelected = SimpleDateFormat("MM").format(Date()).toInt()
        yearSelected = SimpleDateFormat("yyyy").format(Date()).toInt()
        dates = getDatesOfMoth(this.monthSelected, this.yearSelected)
        setCalendar(dates)
    }

    @SuppressLint("SimpleDateFormat", "SetTextI18n")
    private fun getDatesOfMoth(month: Int, year: Int): List<Date> {
        val list = mutableListOf<Date>()
        val initialDate = SimpleDateFormat("MM-dd-yyyy").parse("$month-1-$year")!!
        binding.textMonth.text = "${SimpleDateFormat("MMMM").format(initialDate)} $year"
        for (i in 1..31) {
            val dayOfWeek = getDayOfWeek(initialDate)
            if (i == 1) {
                for (num in dayOfWeek downTo 1) list.add(addDays(initialDate, -num))
                list.add(initialDate)
            }
            val date1: Date = addDays(initialDate, i)
            list.add(date1)
        }
        var date = list[list.size - 1]
        while (list.size < 42) {
            list.add(addDays(date, 1))
            date = list[list.size - 1]
        }
        return list
    }

    private fun setTransition(start: Int, end: Int) {
        stateMotion = if (stateMotion) {
            binding.motionBase.transitionToStart()
            false
        } else {
            binding.motionBase.setTransitionDuration(1000)
            binding.motionBase.setTransition(start, end)
            binding.motionBase.transitionToEnd()
            true
        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun setCalendar(datesOfMoth: List<Date>) {

        var stateSixConstraint = true
        for (num in datesOfMoth.indices) {
            textViews[num].text = SimpleDateFormat("dd").format(datesOfMoth[num])
            val formatMonth = SimpleDateFormat("MM")
            val month = formatMonth.format(datesOfMoth[num]) != formatMonth.format(datesOfMoth[15])
            textViews[num].visibility =
                if (month) {
                    if (num >= 35 && stateSixConstraint)
                        View.GONE
                    else View.INVISIBLE
                } else {
                    if (num >= 35)
                        stateSixConstraint = false
                    View.VISIBLE
                }

        }
    }

    @SuppressLint("SimpleDateFormat")
    private fun getDayOfWeek(date: Date?) = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        (SimpleDateFormat("u").format(date!!)).toInt()
    } else {
        when ((SimpleDateFormat("E").format(date!!))) {
            "Mon" -> 1
            "Tue" -> 2
            "Wed" -> 3
            "Thu" -> 4
            "Fri" -> 5
            "Sat" -> 6
            "Sun" -> 7
            "lun." -> 1
            "mar." -> 2
            "mié." -> 3
            "jue." -> 4
            "vie." -> 5
            "sab." -> 6
            "dom." -> 7
            else -> 1
        }
    }

    private fun addDays(date: Date, days: Int): Date {
        val cal = Calendar.getInstance()
        cal.time = date
        cal.add(Calendar.DATE, days)
        return cal.time
    }

    @SuppressLint("SimpleDateFormat")
    private fun setWeek() {
        val dayOfWeek = getDayOfWeek(dateSelected)
        val datesOfWeek = mutableListOf<Date>()
        val textViews = listOf(
            binding.text01,
            binding.text02,
            binding.text03,
            binding.text04,
            binding.text05,
            binding.text06,
            binding.text07,
        )
        for (day in dayOfWeek downTo 1) datesOfWeek.add(addDays(dateSelected, -day))
        datesOfWeek.add(dateSelected)
        for (day in 1..(6 - dayOfWeek)) datesOfWeek.add(addDays(dateSelected, day))
        for (num in textViews.indices) {
            textViews[num].text = SimpleDateFormat("dd").format(datesOfWeek[num])
            val formatMonth = SimpleDateFormat("MM")
            val month = formatMonth.format(datesOfWeek[num]) != formatMonth.format(dateSelected)
            textViews[num].visibility =
                if (month) {
                    if (num >= 36) View.GONE
                    else View.INVISIBLE
                } else View.VISIBLE
        }
    }

}