package net.swordie.ms.life.movement;

/**
*@author Sjonnie
*Created on 8/16/2018.
*/
public enum MovePathAttribute {
    NORMAL(0),
    JUMP(1),
    IMPACT(2),
    IMMEDIATE(3),
    TELEPORT(4),
    RANDOM_TELEPORT(5),
    DEMON_TRACE_TELEPORT(6),
    RETURN_TELEPORT(7),
    HANGONBACK(8),
    ASSAULTER(9),
    ASSASSINATION(10),
    RUSH(11),
    STATCHANGE(12),
    SITDOWN(13),
    STARTFALLDOWN(14),
    FALLDOWN(15),
    STARTDRAGDOWN(16),
    DRAGDOWN(17),
    STARTWINGS(18),
    WINGS(19),
    ARAN_ADJUST(20),
    MOB_TOSS(21),
    MOB_TOSS_SLOWDOWN(22),
    FLYING_BLOCK(23),
    DASH_SLIDE(24),
    BMAGE_ADJUST(25),
    BLINK_LIGHT(26),
    TELEPORT_ZERO1(27),
    FLASHJUMP(28),
    DOUBLE_JUMP(29),
    DOUBLE_JUMP_DOWN(30),
    TRIPLE_JUMP(31),
    FLASHJUMP_CHANGEEFF(32),
    ROCKET_BOOSTER(33),
    BACKSTEP_SHOT(34),
    CANNON_JUMP(35),
    QUICK_SILVER_JUMP(36),
    MOBPOWERKNOCKBACK(37),
    VERTICALJUMP(38),
    CUSTOMIMPACT(39),
    CUSTOMIMPACT2(40),
    COMBATSTEP(41),
    HIT(42),
    TIMEBOMBATTACK(43),
    SNOWBALLTOUCH(44),
    BUFFZONEEFFECT(45),
    LEAF_TORNADO(46),
    STYLISH_ROPE(47),
    ROPE_CONNECT(48),
    STRIKER_UPPERCUT(49),
    CRAWL(50),
    TELEPORT_BY_MOBSKILLAREA(51),
    ZERO_TAG(52),
    RETREAT_SHOT(53),
    DB_BLADE_ASCENSION(54),
    IMPACT_IGNORE_MOVEPATH(55),
    ANGLE_IMPACT(56),
    STARPLANET_RIDING_BOOSTER(57),
    USER_TOSS(58),
    SLASH_JUMP(59),
    MOB_LADDER(60),
    MOB_RIGHTANGLE(61),
    MOB_STOPNODE_START(62),
    MOB_BEFORE_NODE(63),
    MOB_TELEPORT(64),
    MOB_ATTACK_RUSH(65),
    MOB_ATTACK_RUSH_STOP(66),
    MOB_ATTACK_LEAP(67),
    BATTLEPVP_MUGONG_SOMER_SAULT(68),
    BATTLEPVP_HELENA_STEPSHOT(69),
    SUN_OF_GLORY(70),
    HOOKSHOT_START(71),
    HOOKSHOT(72),
    HOOKSHOT_END(73),
    PINKBEAN_POGO_STICK(74),
    PINKBEAN_POGO_STICK_END(75),
    PINKBEAN_ROLLING_AIR(76),
    FINAL_TOSS(77),
    TELEPORT_KINESIS1(78),
    NIGHTLORD_SHADOWWEB(79),
    TELEPORT_ARAN1(80),
    RW_EXPLOSION_CANNON(81),
    ;

    private final int val;

    MovePathAttribute(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public static MovePathAttribute getByVal(int val) {
        if (val >= 0 && val < values().length) {
            return values()[val];
        }
        return null;
    }
}