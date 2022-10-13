package pckg2.components;

public enum DDD {
    SP_1(11), SP_2(12), SP_3(13), SP_4(14), SP_5(15), SP_6(16), SP_7(17), SP_8(18), SP_9(19),
    RJ_1(21), RJ_2(22), RJ_3(24),
    ES_1(27), ES_2(28),
    MG_1(31), MG_2(32), MG_3(33), MG_4(34), MG_5(35), MG_6(37), MG_7(38),
    PR_1(41), PR_2(42), PR_3(43), PR_4(44), PR_5(45), PR_6(46),
    SC_1(47), SC_2(48), SC_3(49),
    RS_1(51), RS_2(53), RS_3(54), RS_4(55),
    DF(61),
    GO_1(62), GO_2(64),
    TO(63),
    MT_1(65), MT_2(66),
    MS(67),
    AC(68),
    BA_1(71), BA_2(73), BA_3(74), BA_4(75), BA_5(77),
    SE(79),
    PE_1(81), PE_2(87),
    AL(82),
    PB(83),
    RN(84),
    CE_1(85), CE_2(88),
    PI_1(86), PI_2(89),
    MA_1(98), MA_2(99);

    private final int value;

    DDD (int value) {
        this.value = value;
    }

    public int getValue () {
        return this.value;
    }
}
