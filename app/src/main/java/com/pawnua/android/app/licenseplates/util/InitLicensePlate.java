package com.pawnua.android.app.licenseplates.util;

import com.pawnua.android.app.licenseplates.model.LicensePlate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MiK on 14.06.2015.
 */
public class InitLicensePlate {
    List<LicensePlate> licensePlateList = new ArrayList<>();
    public List<LicensePlate> initList(){
        licensePlateList.add(new LicensePlate("АР Крим",                    "01", "КР КО РК",                   "АК", "КК"));
        licensePlateList.add(new LicensePlate("Вінницька область",          "02", "ВІ ВТ ВХ",                   "АВ", "КВ"));
        licensePlateList.add(new LicensePlate("Волинська область",          "03", "ВО ВК ВМ",                   "АС", "КС"));
        licensePlateList.add(new LicensePlate("Дніпропетровська область",   "04", "АА АВ АЕ АН АК АІ СМ",       "АЕ", "КЕ"));
        licensePlateList.add(new LicensePlate("Донецька область",           "05", "ЕА ЕВ ЕК ЕН ЕО ЕС",          "АН", "КН"));
        licensePlateList.add(new LicensePlate("Житомирська область",        "06", "ВВ ВА ВЕ OI",                "АМ", "КМ"));
        licensePlateList.add(new LicensePlate("Закарпатська область",       "07", "РЕ РТ РР",                   "АО", "КО"));
        licensePlateList.add(new LicensePlate("Запорізька область",         "08", "НА НЕ НС НО НР НВ",          "АР", "КР"));
        licensePlateList.add(new LicensePlate("Івано-Франківська область",  "09", "ІВ ІС ІЕ",                   "АТ", "КТ"));
        licensePlateList.add(new LicensePlate("Київська область",           "10", "КХ КК КМ",                   "AI", "КІ"));
        licensePlateList.add(new LicensePlate("місто Київ",                 "11", "КВ КА КЕ КІ КН КТ ІІ ОО",    "АА", "КА"));
        licensePlateList.add(new LicensePlate("Кіровоградська область",     "12", "ОН ОМ ОС",                   "ВА", "НА"));
        licensePlateList.add(new LicensePlate("Луганська область",          "13", "АМ АР АО АТ АХ АС IA",       "ВВ", "HВ"));
        licensePlateList.add(new LicensePlate("Львівська область",          "14", "ТВ ТА ТС ТН TT ТО",          "ВС", "НС"));
        licensePlateList.add(new LicensePlate("Миколаївська область",       "15", "НІ НК НТ",                   "ВЕ", "НЕ"));
        licensePlateList.add(new LicensePlate("Одеська область",            "16", "ОВ ОА ОЕ ОК ОТ",             "ВН", "НН"));
        licensePlateList.add(new LicensePlate("Полтавська область",         "17", "СК СН СС",                   "BI", "НІ"));
        licensePlateList.add(new LicensePlate("Рівненська область",         "18", "РВ РА РО",                   "ВК", "НК"));
        licensePlateList.add(new LicensePlate("Сумська область",            "19", "СА СВ СЕ",                   "ВМ", "НМ"));
        licensePlateList.add(new LicensePlate("Тернопільська область",      "20", "ТІ ТЕ ТК",                   "ВО", "НО"));
        licensePlateList.add(new LicensePlate("Харківська область",         "21", "ХА ХК ХВ ХР",                "АХ", "КХ"));
        licensePlateList.add(new LicensePlate("Херсонська область",         "22", "ХО ХН",                      "ВТ", "НТ"));
        licensePlateList.add(new LicensePlate("Хмельницька область",        "23", "ХМ ХІ",                      "ВХ", "НХ"));
        licensePlateList.add(new LicensePlate("Черкаська область",          "24", "МА МВ МЕ МТ",                "СА", "ІА"));
        licensePlateList.add(new LicensePlate("Чернігівська область",       "25", "ММ МН МК",                   "СВ", "ІВ"));
        licensePlateList.add(new LicensePlate("Чернівецька область",        "26", "МО МР МС",                   "СЕ", "ІЕ"));
        licensePlateList.add(new LicensePlate("місто Севастополь",          "27", "КС",                         "СН", "ІН"));
        licensePlateList.add(new LicensePlate("загальнодержавна серія",     "28", "НН II",                      "ІІ", ""));

        return licensePlateList;
    }
}
