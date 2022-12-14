package com.kartashov;

import com.google.common.base.CharMatcher;

public interface Util {

    String[] sounds = new String[]{
            "A", "I", "U", "E", "O",
            "KA", "KI", "KU", "KE", "KO",
            "SA", "SI", "SU", "SE", "SO",
            "TA", "TI", "TU", "TE", "TO",
            "NA", "NI", "NU", "NE", "NO",
            "HA", "HI", "HU", "HE", "HO",
            "MA", "MI", "MU", "ME", "MO",
            "YA", "YU", "YO",
            "RA", "RI", "RU", "RE", "RO",
            "WA", "(W)O",
            "n",
            "kya", "kyu", "kyo",
            "gya", "gyu", "gyo",
            "sha", "shu", "sho",
            "ja", "ju", "jo",
            "cha", "chu", "cho",
            "nya", "nyu", "nyo",
            "hya", "hyu", "hyo",
            "bya", "byu", "byo",
            "pya", "pyu", "pyo",
            "mya", "myu", "myo",
            "rya", "ryu", "ryo",
    };

    String[] katakana_symbols = new String[]{
            "ア", "イ", "ウ", "エ", "オ",
            "カ", "キ", "ク", "ケ", "コ",
            "サ", "シ", "ス", "セ", "ソ",
            "タ", "チ", "ツ", "テ", "ト",
            "ナ", "ニ", "ヌ", "ネ", "ノ",
            "ハ", "ヒ", "フ", "ヘ", "ホ",
            "マ", "ミ", "ム", "メ", "モ",
            "ヤ", "ユ", "ヨ", "ラ", "リ",
            "ル", "レ", "ロ", "ワ", "ヲ",
            "ン", "ガ", "ギ", "グ", "ゲ",
            "ゴ", "ザ", "ジ", "ズ", "ゼ",
            "ゾ", "ダ", "ヂ", "ヅ", "デ",
            "ド", "バ", "ビ", "ブ", "ベ",
            "ボ", "パ", "ピ", "プ", "ペ",
            "ポ",
            "キャ", "キュ", "キョ",
            "シャ", "シュ", "ショ",
            "チャ", "チュ", "チョ",
            "ニャ", "ニュ", "ニョ",
            "ヒャ", "ヒュ", "ヒョ",
            "リャ", "リュ", "リョ",
            "ギャ", "ギュ", "ギョ",
            "ジャ", "ジュ", "ジョ",
            "ティ", "ディ", "ツィ",
            "ヂャ", "ヂュ", "ヂョ",
            "ビャ", "ビュ", "ビョ",
            "ピャ", "ピュ", "ピョ"};

    CharMatcher HIRAGANA =
            CharMatcher.inRange((char) 0x3040, (char) 0x309f);

    CharMatcher KATAKANA =
            CharMatcher.inRange((char) 0x30a0, (char) 0x30ff);

    CharMatcher KANA = HIRAGANA.or(KATAKANA);

    CharMatcher KANJI =
            CharMatcher.inRange((char) 0x4e00, (char) 0x9faf);

}
