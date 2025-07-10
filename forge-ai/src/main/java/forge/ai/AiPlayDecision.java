package forge.ai;

public enum AiPlayDecision {
    // Play decision reasons
    WillPlay,
    AddBoardPresence,
    Removal,
    Tempo,
    CardAdvantage,

    // Play later decisions
    WaitForMain2,
    AnotherTime,

    // Don't play decision reasons,
    CantPlaySa,
    CantPlayAi,
    CantAfford,
    CantAffordX,
    MissingNeededCards,
    TimingRestrictions,
    MissingPhaseRestrictions,
    NeedsToPlayCriteriaNotMet,
    StopRunawayActivations,
    TargetingFailed,
    CostNotAcceptable,
    WouldDestroyLegend,
    WouldDestroyOtherPlaneswalker,
    WouldBecomeZeroToughnessCreature,
    WouldDestroyWorldEnchantment,
    BadEtbEffects,
    CurseEffects;

    public boolean willingToPlay() {
        return this == WillPlay || this == AddBoardPresence || this == Removal || this == Tempo || this == CardAdvantage;
    }
}