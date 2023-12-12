package com.example.gta5rplaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class TenFour : AppCompatActivity() {

    private lateinit var recyclerViewTenCode: RecyclerView
    private lateinit var searchViewTenCode: SearchView
    private var mList = ArrayList<StatjaData>()
    private lateinit var adapter: StatjaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten_four)
        recyclerViewTenCode = findViewById(R.id.recyclerViewTenCode)
        searchViewTenCode = findViewById(R.id.searchViewTenCode)

        recyclerViewTenCode.setHasFixedSize(true)
        recyclerViewTenCode.layoutManager = LinearLayoutManager(this)

        addDataToList()

        adapter = StatjaAdapter(mList)
        recyclerViewTenCode.adapter = adapter

        searchViewTenCode.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                filterList(newText)
                return true
            }
        })
    }
    private fun filterList(query: String?) {

        if (query != null) {
            val filteredList = ArrayList<StatjaData>()
            for (i in mList) {
                if (i.statjaText.lowercase(Locale.ROOT).contains(query)){
                    filteredList.add(i)
                }
            }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "Не найдено!!!", Toast.LENGTH_LONG).show()
            } else {
                adapter.setFilteredList(filteredList)
            }
        }

    }
    private fun addDataToList() {
        mList.add(StatjaData(10.0, "10-0 Отбой / Отмена" ))
        mList.add(StatjaData(10.3, "10-3 Прекратите передачу" ))
        mList.add(StatjaData(10.4, "10-4 Принято" ))
        mList.add(StatjaData(10.5, "10-5 Повторите" ))
        mList.add(StatjaData(10.6, "10-6 Отказ" ))
        mList.add(StatjaData(10.7, "10-7 Ожидайте" ))
        mList.add(StatjaData(10.8, "10-8 Вышел в патруль" ))
        mList.add(StatjaData(10.10, "10-10 Закончил патруль" ))
        mList.add(StatjaData(10.12, "10-12 В участке посетители" ))
        mList.add(StatjaData(10.15, "10-15 Возвращайтесь в участок" ))
        mList.add(StatjaData(10.20, "10-20 Моё местоположение" ))
        mList.add(StatjaData(10.21, "10-21 Локация происшествия" ))
        mList.add(StatjaData(10.22, "10-22 Выехал по коду" ))
        mList.add(StatjaData(10.26, "10-26 Провожу задержание" ))
        mList.add(StatjaData(10.30, "10-30 Сопровождение колонны" ))
        mList.add(StatjaData(10.43, "10-43 Запрос информации о происшествии" ))
        mList.add(StatjaData(10.46, "10-46 Провожу обыск" ))
        mList.add(StatjaData(10.48, "10-48 Требуется эвакуация" ))
        mList.add(StatjaData(10.50, "10-50 Веду преследование" ))
        mList.add(StatjaData(10.55, "10-55 Провожу Traffic Stop" ))
        mList.add(StatjaData(10.66, "10-66 Провожу Felony Traffic Stop" ))
        mList.add(StatjaData(10.70, "10-70 Требуется поддержка" ))
        mList.add(StatjaData(10.77, "10-77 Расчетное время прибытия (ETA)" ))
        mList.add(StatjaData(10.78, "10-78 Требуется медик" ))
        mList.add(StatjaData(10.99, "10-99 Все спокойно" ))
        mList.add(StatjaData(0.0, "Код 0 Офицер на земле" ))
        mList.add(StatjaData(0.1, "Код 1 По офицерам открыт огонь" ))
        mList.add(StatjaData(0.2, "Код 2 Запрос поддержки без мигалок" ))
        mList.add(StatjaData(0.3, "Код 3 Массовые беспорядки" ))
        mList.add(StatjaData(0.4, "Код 4 Всё хорошо" ))
    }
}