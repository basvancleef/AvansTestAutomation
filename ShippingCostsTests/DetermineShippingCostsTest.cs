using ShippingCostsLibrary;
using FluentAssertions;

namespace ShippingCostsTests;

public class DetermineShippingCostsTest
{
    private DetermineShippingCosts _determineShippingCosts = new();

    [Fact]
    public void ShippingCosts_ForGround_ShouldBe100()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "Ground", 50);
        result.Should().Be(100);
    }

    [Fact]
    public void ShippingCosts_ForInStore_ShouldBe50()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "InStore", 50);
        result.Should().Be(50);
    }

    [Fact]
    public void ShippingCosts_ForNextDayAir_ShouldBe250()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "NextDayAir", 50);
        result.Should().Be(250);
    }

    [Fact]
    public void ShippingCosts_ForSecondDayAir_ShouldBe125()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "SecondDayAir", 50);
        result.Should().Be(125);
    }

    [Fact]
    public void ShippingCosts_ForUnknownType_ShouldBe0()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "Unknown", 50);
        result.Should().Be(0);
    }

    [Fact]
    public void ShippingCosts_WhenTotalPriceGreaterThan1500_ShouldBe0()
    {
        var result = _determineShippingCosts.ShippingCosts(true, "Ground", 1600);
        result.Should().Be(0);
    }

    [Fact]
    public void ShippingCosts_WhenCalculateShippingCostsIsFalse_ShouldBe0()
    {
        var result = _determineShippingCosts.ShippingCosts(false, "Ground", 50);
        result.Should().Be(0);
    }
}