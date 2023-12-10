package com.example.gta5rplaws

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UakLawActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private var mList = ArrayList<StatjaData>()
    private lateinit var adapter: StatjaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uak_law)

        recyclerView = findViewById(R.id.recyclerViewUak)
        searchView = findViewById(R.id.searchViewUak)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()

        adapter = StatjaAdapter(mList)
        recyclerView.adapter = adapter

    }

    private fun addDataToList() {
        mList.add(StatjaData(1.1, "Преступлением признается виновно совершенное общественно опасное деяние (противоправное, осознанное, волевое, действие или бездействие, нарушающее или создавшее реальную угрозу нарушения общественных отношений, охраняемых Уголовным законодательством), запрещенное настоящим Кодексом под угрозой наказания." ))
        mList.add(StatjaData(1.2, "Не является преступлением действие (бездействие), хотя формально и содержащее признаки преступления, но в силу малозначительности не представляющее общественной опасности." ))
        mList.add(StatjaData(1.3, "Совокупностью преступлений признается совершение двух или более преступлений. При совокупности преступлений лицо несет уголовную ответственность за каждое совершенное преступление по соответствующей статье или части статьи настоящего Кодекса." ))
        mList.add(StatjaData(1.4, "Покушением на преступление признаются умышленные действия (бездействие) лица, непосредственно направленные на совершение преступления, если при этом преступление не было доведено до конца по не зависящим от этого лица обстоятельствам." ))
        mList.add(StatjaData(1.41, "Лицо, которое было задержано при покушении на преступление, при наличии всех необходимых доказательств которые подтверждают гарантированный факт покушения, несёт ответственность в виде 50% от размера наказания статьи, в случае административного ареста - не более 4 лет, и в случае федеральной статьи - не менее 6 лет." ))
        mList.add(StatjaData(1.5, "Общественное Место - территория, пространство, помещение, постоянно или в какой-либо период времени свободное для доступа и использования неопределенным кругом лиц. Так же весь список объектов выделенных зеленым маркером" ))
        mList.add(StatjaData(1.6, "Клевета - Выражается в распространении заведомо ложных сведений, имеющих порочащий характер. Обязателен признак «заведомости» — то есть осознание преступником несоответствия таких сведений действительности, что сообщаемые факты и события не имели место в реальности, а значит с субъективной стороны преступление всегда совершалось с прямым умыслом. Если лицо, распространившее ложные измышления, заблуждалось относительно соответствия действительности распространяемых им сведений, однако высказывания его носили оскорбительный характер, оно может быть привлечено к ответственности за оскорбление, а не за клевету." ))
        mList.add(StatjaData(1.7, "«Заведомость» - определенные признаки, относящиеся к потерпевшему или объективной стороне преступления, которые хорошо известны виновному в момент совершения общественно опасного деяния." ))
        mList.add(StatjaData(1.8, "Административное правонарушение (проступок) - противоправное, виновное (умышленное или неосторожное) действие или бездействие, посягающие на общественный порядок, собственность, права и свободы граждан, на установленный порядок управления и за которые законом предусмотрена административная ответственность." ))
        mList.add(StatjaData(2.1, "Соучастием в преступлении признается умышленное совместное участие двух или более лиц в совершении умышленного преступления." ))
        mList.add(StatjaData(2.2, " Соучастниками преступления наряду с исполнителем признаются организатор, подстрекатель и пособник.\n" +
                "Исполнитель - лицо, непосредственно совершившее преступление, либо непосредственно участвовавшее в его совершении совместно с другими лицами (соисполнителями);\n" +
                "Организатор - организатором признается лицо, организовавшее совершение преступления или руководившее его исполнением;\n" +
                "Подстрекатель - лицо, склонившее другое лицо к совершению преступления путем уговора, подкупа, угрозы или другим способом.\n" +
                "Пособник - лицо, содействовавшее совершению преступления советами, указаниями, предоставлением информации, средств или орудий совершения преступления либо устранением препятствий." ))
        mList.add(StatjaData(2.3, "Соучастники преступления вне зависимости от вида соучастия несут ответственность в равном объёме." ))
        mList.add(StatjaData(2.4, "Преступление признается совершенным группой лиц, если в его совершении совместно участвовали два или более исполнителя." ))
        mList.add(StatjaData(2.5, "Совершение преступления группой лиц влечет более строгое наказание." ))
        mList.add(StatjaData(3.1, "Не является преступлением причинение вреда посягающему лицу в состоянии необходимой обороны, при защите личности и прав обороняющегося или других лиц, если это посягательство было сопряжено с насилием, опасным для жизни обороняющегося или другого лица, либо с непосредственной угрозой применения такого насилия." ))
        mList.add(StatjaData(3.2, "При причинении вреда в состоянии необходимой обороны не должны быть нарушены пределы необходимой обороны (умышленные действия, явно не соответствующие характеру и опасности посягательства)." ))
        mList.add(StatjaData(3.3, "Не является преступлением причинение вреда лицу, совершившему преступление, при его задержании для доставления органам власти, если иными средствами задержать такое лицо не представлялось возможным и при этом не было допущено превышения необходимых для этого мер (когда лицу без необходимости причиняется явно чрезмерный, не вызываемый обстановкой вред)." ))
        mList.add(StatjaData(3.4, "Не является преступлением причинение вреда в состоянии крайней необходимости, то есть для устранения опасности, непосредственно угрожающей личности и правам данного лица или иных лиц, если эта опасность не могла быть устранена иными средствами и при этом не было допущено превышения пределов крайней необходимости (явно не соответствующего характеру и степени угрожавшей опасности и обстоятельствам)." ))
        mList.add(StatjaData(3.5, "Не является преступлением причинение вреда при обоснованном риске для достижения общественно полезной цели, если указанная цель не могла быть достигнута не связанными с риском действиями (бездействием). Риск не признается обоснованным, если он заведомо был сопряжен с угрозой для жизни многих людей." ))
        mList.add(StatjaData(3.6, "Не является преступлением причинение вреда охраняемым интересам лицом, действующим во исполнение обязательных для него приказа или распоряжения. Уголовную ответственность за причинение такого вреда несет лицо, отдавшее незаконные приказ или распоряжение. (Лицо, совершившее преступление во исполнение заведомо незаконных приказа или распоряжения, несет уголовную ответственность на общих основаниях. Неисполнение заведомо незаконных приказа или распоряжения исключает уголовную ответственность)." ))
        mList.add(StatjaData(4.1, "Лицу, признанному виновным в совершении преступления, назначается справедливое наказание в пределах, предусмотренных соответствующей статьей Особенной части настоящего Кодекса, и с учетом положений Общей части настоящего Кодекса." ))
        mList.add(StatjaData(4.2, "При назначении наказания учитываются характер и степень общественной опасности преступления и личность виновного, в том числе обстоятельства, смягчающие и отягчающие наказание." ))
        mList.add(StatjaData(4.3, "При наличии административной статьи, предусматривающей возможность оплаты штрафа, заключение под стражу возможно только при условии отказа виновным лицом от его уплаты. [Задержанное лицо делает выбор, оплатить штраф или быть арестованным. После избрания меры наказания, изменить выбор нельзя.]" ))
        mList.add(StatjaData(4.4, "Смягчающими обстоятельствами признаются:\n" +
                "\n" +
                "совершение преступления в результате физического или психического принуждения либо в силу материальной, служебной или иной зависимости;\n" +
                "совершение преступления при нарушении условий правомерности необходимой обороны, задержания лица, совершившего преступление, крайней необходимости, обоснованного риска, исполнения приказа или распоряжения;\n" +
                "противоправность или аморальность поведения потерпевшего, явившегося поводом для преступления;\n" +
                "явка с повинной, активное способствование раскрытию и расследованию преступления, изобличению и уголовному преследованию других соучастников преступления;\n" +
                "оказание медицинской и иной помощи потерпевшему после совершения преступления, добровольное возмещение имущественного ущерба и морального вреда, причиненных в результате преступления, иные действия, направленные на заглаживание вреда, причиненного потерпевшему;\n" +
                "иные обстоятельства.\n" +
                "В случае использования статьи 4.4 настоящего кодекса необходимо учитывать следующее:\n" +
                "При применении статьи в отношении наказания инкриминируемого по статьям имеющих административную юрисдикцию - разрешено уменьшение срока заключения максимум на два месяца [20 минут]. Минимальный срок заключения: два месяца [20 минут]\n" +
                "При применении статьи в отношении наказания инкриминируемого по статьям имеющих региональную/федеральную юрисдикцию - разрешено уменьшение срока заключения максимум на шесть месяцев [30 минут]. Минимальный срок заключения: 6 месяцев [30 минут]" ))
        mList.add(StatjaData(4.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.31, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(5.51, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.11, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.21, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.31, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.32, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(6.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(7.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(7.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(7.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(7.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(8.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(9.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(9.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(9.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(9.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(9.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(10.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.11, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(11.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.71, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.72, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.9, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.10, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.11, "val statjaNumber : Double" ))
        mList.add(StatjaData(12.12, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.41, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(13.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(14.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(14.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(14.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(14.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(14.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(15.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.9, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.10, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.11, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.12, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.13, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.14, "val statjaNumber : Double" ))
        mList.add(StatjaData(16.15, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.7, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.8, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.9, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.10, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.11, "val statjaNumber : Double" ))
        mList.add(StatjaData(17.12, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.1, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.2, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.3, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.4, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.5, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.51, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.52, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.53, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.6, "val statjaNumber : Double" ))
        mList.add(StatjaData(18.7, "val statjaNumber : Double" ))


    }


}