@org.hibernate.annotations.TypeDefs({
    @org.hibernate.annotations.TypeDef(
        name="monetary_amount_usd",
        typeClass = MonetaryAmountType.class,
        parameters = { @org.hibernate.annotations.Parameter(name="convertTo", value="USD") }
    ),
    @org.hibernate.annotations.TypeDef(
        name="monetary_amount_eur",
        typeClass = MonetaryAmountType.class,
        parameters = { @org.hibernate.annotations.Parameter(name="convertTo", value="EUR") }
    )
})

@org.hibernate.annotations.FilterDefs({
    @org.hibernate.annotations.FilterDef(
        name="limitItemsByUserRank",
        parameters = {
            @org.hibernate.annotations.ParamDef(
                name = "currentUserRank", type = "int"
            )
        }
    )
})


package auction.persistence;
