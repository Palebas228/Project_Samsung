package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayMessage_Activity extends Activity {
    TextView textView;
    Button button;
    MediaPlayer mPlayer;
    MediaPlayer mp1Player;
    MediaPlayer mp2Player;
    MediaPlayer mp3Player;

    int k = 0;
    private ConstraintLayout mBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message_);
        textView = (TextView) findViewById(R.id.Nashtext);
        button = (Button) findViewById(R.id.button2);
        mBackground=(ConstraintLayout) findViewById(R.id.layout);
        button.setAlpha(1);
        SharedPreferences sharedPreferences = getSharedPreferences("main", MODE_PRIVATE);
        //getIntent().getBooleanExtra("isNew",true);
        //k = sharedPreferences.getInt("counter", 0);
        mPlayer= MediaPlayer.create(this, R.raw.ambient1);
        mp1Player= MediaPlayer.create(this, R.raw.les);
        mp2Player= MediaPlayer.create(this, R.raw.kamni);
        mp3Player= MediaPlayer.create(this, R.raw.telka);
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sharedPreferences = getSharedPreferences("main", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("counter", k);
        editor.apply();

    }


    public void butt(View view) {
        if (k==0){
            button.setAlpha(0);
            textView.setText("День близился к концу, а это значит, что пора просыпаться.");
            mBackground.setBackgroundResource(R.color.black);

        }
        if (k==1){
            mPlayer.start();
            mBackground.setBackgroundResource(R.drawable.dom);
            textView.setText(" Не помню, когда у меня появилась такая привычка - вставать с началом вечера, а ложится днем. Ночной образ жизни ни к чему хорошему не приведет, но мне уже как-то все равно, мое здоровье меня волнует далеко не в первую очередь. Открыв веки, я, как робот, пошел умываться.");


        }
        if (k==2){
            textView.setText(" В который... или нет который год я так делаю, не помню, да и все равно, кому какое дело. Умывшись, я взглянул в зеркало. Все такое же уставшее от жизни лицо.");

        }
        if (k==3){
            textView.setText("Умывшись, я взглянул в зеркало. Все такое же уставшее от жизни лицо.");
            mBackground.setBackgroundResource(R.drawable.gg);
        }
        if (k==4){
            textView.setText(" -Эх, ничего не меняется...- промямлил я, подавляя порывы вечной скуки.");

        }
        if (k==5){
            textView.setText("Я решил плеснуть себе кофе, ведь грядущая ночь будет долгой, а кофе - лучший способ окончательно проснутся и взбодрится! Я зашел на кухню.");
            mBackground.setBackgroundResource(R.drawable.kuhna);
        }
        if (k==6){
            textView.setText("На кухне, как всегда, был беспорядок, мне просто лень было прибираться, ведь зачем тратить лишние силы? Я поставил на плиту чайник.");
        }
        if (k==7){
            textView.setText("После чего я зажег ее, однако советская техника никак не хотела включатся. Холодный пот прошелся по моему телу.");
        }
        if (k==8){
            textView.setText("-Неужели не заплатил за газ?! Проклятые ЖКХ...");
        }
        if (k==9){
            textView.setText("Я решил проверить почтовый ящик. Я вышел из комнаты и начал спускаться на первый этаж. ");
            mBackground.setBackgroundResource(R.drawable.podesd);
        }
        if (k==10){
            textView.setText("Спустившись, я подошел и открыл свой ящик, благо на нем не было замка, я без труда открыл его и внутри оказалось то, чего я так боялся - извещение об оплате газа.");
            mBackground.setBackgroundResource(R.drawable.yaziki);
        }
        if (k==11){
            textView.setText("-Черт...");

        }
        if (k==12){
            textView.setText("Выругнувшись под себя, я взял злосчастную бумагу и пошел обратно в квартиру");
            mBackground.setBackgroundResource(R.drawable.podesd);
        }
        if (k==13){
            textView.setText("Вернувшись, я сразу же сел за компьютер.");
            mBackground.setBackgroundResource(R.drawable.dom);
        }
        if (k==14){
            textView.setText("~И что мне делать? Чекну-ка я вк, может хоть кому-то я внезапно понадобился~");

        }
        if (k==15){
            textView.setText("Я открыл свою страницу, но, как всегда, кроме сообщений в беседе моего университета ничего не было.");

        }
        if (k==16){
            textView.setText("~Может стоит хоть прийти на пару? Интересно меня отчислили?~");

        }
        if (k==17){
            textView.setText("Я поспешил задать этот вопрос в беседу. Ответ последовал с небольшим задержанием: “Нет”");

        }
        if (k==18){
            textView.setText("~Удивительно, сколько я уже не хожу туда, а меня все еще не отчисляют~");

        }
        if (k==19){
            textView.setText("И в правду! Я не на коммерческом, но почему-то я все еще числюсь как ученик. Возможно, мой ректор не теряет надежду на то, что я приду. Пфф... пускай надеется и дальше, до диплома.");

        }
        if (k==20){
            textView.setText("Это само по себе было чудом, что я попал на бюджет, хотя, учитывая как я сдал экзамены, то было это очевидно. Еще в школе я хотел стать программистом, написать свою программу, которая поможет науке, но как-то этот детский энтузиазм прошел со временем, а вместе с ним изменился и я.");

        }
        if (k==21){
            textView.setText("Я закрылся от общества в надежде, что смогу так реабилитироваться, но все тщетно...");

        }
        if (k==22){
            textView.setText("~ Ну и ладно, кому какое дело, я никому не нужен. Однокашникам на меня плевать, родители вообще, наверное, забыли о моем существовании, а пацаны из ВоВки и без меня пока справляются~");

        }
        if (k==23){
            textView.setText("Я продолжал страдать от скуки, скроля ленту новостей. В какой-то момент времени мне наскучало и это. Я открыл свой любимый сайт по просмотру аниме.");

        }
        if (k==24){
            textView.setText("~Так-с, посмотрим какие там тайтлы в топе...~");

        }
        if (k==25){
            textView.setText("В топе были одни лишь иссекаи и сёнены. ");

        }
        if (k==26){
            textView.setText("В топе были одни лишь иссекаи и сёнены. ");

        }
        if (k==27){
            textView.setText("~Как же они надоели, что там школьники никак не наедятся своих исекайных-этти-гаремников. Проклятые шкилы, из-за них страдают нормальные люди~");

        }
        if (k==28){
            textView.setText("Ну да... “нормальные”, если бы это кто-то услышал, он бы явно проиграл в голос. Не сказал бы, что не люблю эти жанры, но их так много и они так сильно похоже друг на друга, что я уже начал забывать, что я смотрел вчера.");

        }
        if (k==29){
            textView.setText("Мне вот всегда нравились детективные аниме. Где интересная подача сюжета и раскрытые герои, а не очередная перерожденная Мэри Сью и развратные аниме-девочки.");

        }
        if (k==30){
            textView.setText("~Может сериальчик посмотреть какой-нибудь?~");

        }
        if (k==31){
            textView.setText("Зайдя на сайт, меня сразу же поспешили оповестить, что моя подписка подошла к концу.");

        }
        if (k==32){
            textView.setText("~Да что за день-то такой - поганый! То ЖКХ, то аниме, то это! Так же недалеко от ручки...~");

        }
        if (k==33){
            textView.setText("Именно в этот момент мне сильно захотелось покушать. Пробежав глазами окрестности моего стола, я не обнаружил своей любимой лапши быстрого приготовления .");

        }
        if (k==34){
            textView.setText("~Ну точно, сегодня официально самый худший день в году... но будут ли лучше?~");

        }
        if (k==35){
            textView.setText("Конечно, это был риторический вопрос. Я начал одеваться, а когда закончил проверил баланс на своей карте. 322 рубля...");

        }
        if (k==36){
            textView.setText("~Ого, хватит не только на похавать, но и на десерт: энергос и сникерс~");

        }
        if (k==37){
            textView.setText("Заряженный хоть какой-то позитивной мыслью, я поспешил выйти из дома, до закрытия ближайшего ларька. Пройдя очередной лестничный проем подъезда, я оказался на улице. ");
            mBackground.setBackgroundResource(R.drawable.podesd);
        }
        if (k==38){
            textView.setText("Вдохнув родной воздух хрущевок, я инстинктивно откашлялся. Не переношу на дух воздух улиц и города. Постояв какое-то время и потупив в вверх, я наконец двинулся в путь.");
            mBackground.setBackgroundResource(R.drawable.pereulok);
        }
        if (k==39){
            textView.setText("Пройдя мимо детской площадки, меня, внезапно, захватили воспоминания о детстве. Тогда я был счастлив и даже не задумывался о том, что такое тоска и депрессия.");
            mBackground.setBackgroundResource(R.drawable.ploshadka);
        }
        if (k==40){
            textView.setText("~Эх, давно это было. Вот бы вернуться в детство и дать себе подзатыльник с наказаниями о том, чтобы никогда не терял веру в людей...~");

        }
        if (k==41){
            textView.setText("Но прошлого не изменишь, как любят говорить различные “философы”. Подождав еще пару мгновений, я продолжил путь.");
            mBackground.setBackgroundResource(R.drawable.tropinka);
        }
        if (k==42){
            textView.setText("Я шел, полностью погрузившись в свои думы. Я довольно часто рассуждал о том, а правильный ли я выбрал курс в жизни? По большей части, такие вопросы оставались без ответа.");

        }
        if (k==43){
            textView.setText("Мне было страшно давать на них ответы, ведь это какая-никакая ответственность, от которой я постоянно бегу. Внезапно, я обратил внимание куда я иду. Уж больно долго я иду до ларька, который практически в нескольких метрах от моего дома. Обратив внимание, я невольно сказал:");

        }
        if (k==44){
            textView.setText("-Какого черта?! Где я?");
            mPlayer.stop();
            mp2Player.start();

        }
        if (k==45){
            textView.setText("Я вышел совершенно в незнакомое мне место. Это была какая-то странная дорога, окруженная огромными валунами.");
            mBackground.setBackgroundResource(R.drawable.mesto1);
        }
        if (k==46){
            textView.setText("Рядом с дорогой красовался фонарик, напоминавший те, что в Японии. Я стоял как завороженный. Я ничего не понимал. Как такое вообще могло произойти? ");

        }
        if (k==47){
            textView.setText("Паника захватила меня, мне хотелось рвать и метать, лишь бы вернуться в свой район. Однако вместе с паникой пришел и страх, сковавший меня на месте. Так прошло около минуты. После чего, я по-немногу начал приходить в себя.");

        }
        if (k==48){
            textView.setText("~Так, надо логически подумать, как я здесь оказался, хотя какая тут логика?! Что за чертовщина сегодня происходит?!~");

        }
        if (k==49){
            textView.setText("Во мгновение ока, в моей голове послышался ласковый, успокаивающий голос. Я не смог разобрать слова из-за страха, но когда голос звучал у меня в голове, мне становилось спокойнее.");

        }
        if (k==50){
            textView.setText("И вот голос затих. Я начал приходить в себя. Делать было нечего, надо как-то выбираться из этого места. Взяв все остатки воли, я принял решение двигаться дальше по тропинке.");

        }
        if (k==51){
            textView.setText("Мысль о том, что это за место, а главное, как я сюда попал не покидали мою голову. И что это был за голос у меня в голове? По всюду были лишь сплошные вопросы, и как всегда никаких ответов. Какое-то время я шел по тропинке и вышел к лесу. ");

        }
        if (k==52){
            textView.setText("Новая волна страха снова захватила меня с головой. ");
            mBackground.setBackgroundResource(R.drawable.les);
        }
        if (k==53){
            textView.setText("~Откуда здесь лес?! Город в нескольких километрах от леса. А от такого дремучего, наверное, в нескольких сотнях не меньше!~");

        }
        if (k==54){
            textView.setText("~Откуда здесь лес?! Город в нескольких километрах от леса. А от такого дремучего, наверное, в нескольких сотнях не меньше!~");

        }
        if (k==55){
            textView.setText("-Иди... вперед...");

        }
        if (k==56){
            textView.setText("Конечно, любой человек со здравым рассудком сделал бы наоборот и как можно скорее бы оказался бы подальше от этого голоса. Именно так я и решил поступить, я развернулся назад и... И увидел все тот же лес.");

        }
        if (k==57){
            textView.setText("~А где тропинка, по которой я прошел?~");

        }
        if (k==58){
            textView.setText("Голос снова раздался у меня в голове, но не так ласково:");

        }
        if (k==59){
            textView.setText("-Нет... дороги назад... только вперед... иди...");

        }
        if (k==60){
            textView.setText("Я продолжал стоять, но не из-за страха, а уже из интереса, что будет если я не пойду. Так продолжалось не долго и спустя 5 минут непрерывного стояния я проиграл голосу и решил сделать шаг вперед. Но тут же решил оступиться.");

        }
        if (k==61){
            textView.setText("~А вдруг это ловушка, где подвох?~");

        }
        if (k==62){
            textView.setText("Я продолжал стоять, рассуждая о моем положении.");

        }
        if (k==63){
            textView.setText("~Мда, небогатый у меня выбор: либо стоять на месте в ожидании чуда, либо сделать как велит голос. Но к чему меня это приведет? Разумно ли это?~");

        }
        if (k==64){
            textView.setText("Здравый смысл не помогал мне и, видимо, мне придется действовать наобум. Кто знает, что будет если я пойду? Однако, мне было очевидно, что ничего не произойдет если я буду стоять на месте.");

        }

        if (k==65){
            textView.setText("-Что ж, вперед так вперед - сказал я себе, понимая, что это не способно успокоить меня.");

        }
        if (k==66){
            textView.setText("Я пошел по тропинке, ведущей куда-то вглубь леса. Голос в голове вел меня:");
            mp2Player.stop();
            mp1Player.start();
        }
        if (k==67){
            textView.setText("-Направо... теперь прямо... теперь налево... молодец, ты пришел куда нужно...");

        }
        if (k==68){
            textView.setText("“ты пришел куда нужно”, - это не вглубь леса, а к себе домой, но навязчивый голос пропал. Я стоял на месте, совершенно не понимая куда мне идти.");

        }
        if (k==69){
            textView.setText("~А может ну его? Повернусь да обратно пойду, вроде, помню как обратно идти~");

        }
        if (k==70){
            textView.setText("Когда я повернулся назад, я потерял не только дар речи, но и не мог пошевелиться на месте. Животный страх убил все человеческое во мне. Мне хотелось метаться, кричать, убежать, но я не мог!");

        }
        if (k==71){
            textView.setText("Позади меня стояла фигура в плаще. Лица я не видел, зато отчетливо виднелись горящие глаза, как у хищника. В этот миг, я поверил во все сказки о монстрах в лесах. И казалось, я уже смирился со своей судьбой, как внезапно, фигура промолвила таким знакомым голосом:");
            mBackground.setBackgroundResource(R.drawable.chel);
        }
        if (k==72){
            textView.setText("-Ну здравствуй, Дима, долго же ты решался сюда прийти - фигура сделала смешок.");
            mp1Player.stop();
            mp3Player.start();
        }
        if (k==73){
            textView.setText("Хотел бы я ей ответить, да не мог. Из-за страха я онемел, и не мог выдавить ни звука из себя.");

        }
        if (k==74){
            textView.setText("-Что молчишь, как в рот набравший воды? Не бойся, все уже позади и впереди, лес же вокруг - фигура продолжала издеваться надо мной.");

        }
        if (k==75){
            textView.setText("-Молчу, потому что меня учили с незнакомцами не разговаривать - выдавил я из себя, и вместе с этим весь свой страх.");

        }
        if (k==76){
            textView.setText("-Как же мы не знакомы? Я же говорила тебе свое имя, когда ты был около фонаря. Ты, что не услышал?");

        }
        if (k==77){
            textView.setText("~Так этот голос хотел представиться? Ну да, пожалуй это лучшая возможность представиться, когда у человека от страха сердце готово выпрыгнуть~");

        }
        if (k==78){
            textView.setText("-Может ты и говорила свое имя, но я тебе не представлялся - я понял, что нет смысла бояться и полностью успокоился.");

        }
        if (k==79){
            textView.setText("-Может да, а может и нет, ты не можешь в этом быть уверен - фигура продолжала играющим голосом издеваться надо мной.");

        }
        if (k==80){
            textView.setText("-Как же мы не знакомы? Я же говорила тебе свое имя, когда ты был около фонаря. Ты, что не услышал?");

        }
        if (k==81){
            textView.setText("-Хватит ломать комедию, я здесь не за этим, ты бы лучше сказала, как отсюда выбраться - мне надоели все ее хождения вокруг да около и я решил немного надавить.");

        }
        if (k==82){
            textView.setText("-А не за этим ли ты? - в ее руках появилась пачка моего любимого ролтона.");

        }
        if (k==83){
            textView.setText("-К...как? Что все это может значить?!");

        }
        if (k==84){
            textView.setText("-А как ты предлагаешь тебя позвать подышать свежим воздухом? Конечно мне пришлось идти на такую хитрость.");

        }
        if (k==85){
            textView.setText("Я не мог поверить всему, что здесь происходит. Мне казалось, что все это сон - дурацкая шутка подсознания, и я сейчас проснусь. Но, к моему сожалению, это был не сон, все происходило в взаправду. Я продолжал стоять, не понимая что мне сказать.");

        }
        if (k==86){
            textView.setText("-Ладно, у меня и так дел полным-полно, а я тут стою и трачу свое долгожданное время на тебя.");

        }
        if (k==87){
            textView.setText("- Я не с проста выбрала именно тебя, Дима. Ведь только ты можешь все исправить, хоть я в это и не верю, но так сказал старейшина.");

        }
        if (k==88){
            textView.setText("~Какой старейшина? Что исправить? Ты случаем не под веществами?~");

        }
        if (k==89){
            textView.setText("-А и да, выбора то у тебя походу и нет, ты либо соглашаешься на мое предложение...");

        }
        if (k==90){
            textView.setText("-Либо? - прервал я ее.");

        }
        if (k==91){
            textView.setText("-...либо не перебивай меня, и узнаешь вторую часть моего предложения.");

        }
        if (k==92){
            textView.setText("Я молча стоял и сверлил ее взглядом.");

        }
        if (k==93){
            textView.setText("-Кхм... так на чем я там остановилась, ах да - либо ты останешься в междумирье навсегда.");

        }
        if (k==94){
            textView.setText("~Междумирьем? Это какой-то поселок? Или деревня?~");

        }
        if (k==95){
            textView.setText("Я не рискнул это спросить, однако я прекрасно понимал серьезность ее намерений.");

        }
        if (k==96){
            textView.setText("-И куда ты меня отправишь, если не секрет?");

        }
        if (k==97){
            textView.setText("-Секрет - ехидно сказала она.");

        }
        if (k==98){
            textView.setText("-Ну так, что там с решением, время то идет - она, как ребенок, постучала ножкой, символизируя ожидание.");

        }
        if (k==99){
            textView.setText("И ведь действительно, надо принимать решение. Если так подумать, то отправляться незнамо куда мне не очень хочется, но перспектива остаться где-то между мирами, мне тоже не хочется. Я вспомнил аксиому Эскобара. Что же мне делать?");

        }
        if (k==100){
            textView.setText("-Знаешь, что-то ты не вызываешь у меня доверия, да и уж больно все как-то просто..");

        }
        if (k==101){
            textView.setText("-Иии это нет? - на минуту мне показалось, что под ее капюшоном появилась гримаса сомнения.");

        }
        if (k==102){
            textView.setText("-По-моему, я не говорил такого, просто ищу подвох, все уж больно заманчиво... - я продолжал пытаться хоть что-то выудить у нее, хотя бы маленькие, но намеки на то, куда она хочет меня отправить.");

        }
        if (k==103){
            textView.setText("-Подвоха он ищет, в такие моменты надо не думать, а принимать решения - в ее голосе были слышны нотки нетерпеливости.");

        }
        if (k==104){
            textView.setText("-Мне же надо понимать на что я соглашаюсь, а то ситуация как с подписью договором: все подробности мелким почерком, которые никто не читает.");

        }
        if (k==105){
            textView.setText("-Ну знаешь, я понятия не имею, что вы в своем мире делаете, но мне неинтересно. Так, ты мне надоел, хватит ломаться и говори прямо - да или нет?");

        }
        if (k==106){
            textView.setText("Я вновь замялся, мне совершенно не хотелось подписываться на то, о чем я совершенно не знаю. Какое-то время я стоял и думал о своем положении и о моих шансах на выход из нее. Расчет показал, что у меня нет ни единого шанса на выход из этого леса.");

        }
        if (k==107){
            textView.setText("Я не знаю где я, не знаю дороги, хотя о какой дороги идет речь, если я прохожу какое-то расстояние, она исчезает и я не могу вернуться обратно. Я с треском в зубах все же решил согласиться, хоть это мне и не нравилось.");

        }
        if (k==108){
            textView.setText("-Хмм... Эх, ладно, отправляй меня куда-то, все куда-то лучше, чем здесь - с трудом произнес я.");

        }
        if (k==109){
            textView.setText("-Я сделаю вид, что не слышала последней части предложения.");

        }
        if (k==110){
            textView.setText("Фигура протянула мне руку. В ней загорелся фиолетовый магический шар, как будто она собирается сжечь меня им.");
            mBackground.setBackgroundResource(R.drawable.sdelka);
        }
        if (k==111){
            textView.setText("-Руку давай, что смотришь!");

        }
        if (k==112){
            textView.setText("Я неуверенно протянул руку. Пламя объяло меня, но я не горел. Наоборот мне было холодно и как-то не по себе.");

        }
        if (k==113){
            textView.setText("-Надеюсь, я сделала все правильно, ибо это моя первая практика.");

        }
        if (k==114){
            textView.setText("~Первая практика?!~");

        }
        if (k==115){
            textView.setText("Страх вновь напомнил о себе и вмести с ним пришел и гнев.");

        }
        if (k==116){
            textView.setText("-Что значит “первая практика”?! Ты что удумала?! Я тебе, что подопытная крыыыы..");

        }
        if (k==117){
            textView.setText("Не успев договорить, я очутился в пустоте. Гул в ушах не отпускал меня. А потом гул сменился тишиной. И я рискнул открыть глаза...");

        }

        k+=1;
    }
    }
