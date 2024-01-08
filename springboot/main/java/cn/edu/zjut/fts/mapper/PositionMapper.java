package cn.edu.zjut.fts.mapper;

import cn.edu.zjut.fts.entity.Position;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PositionMapper extends BaseMapper<Position>
{

    @Select("select * from position")
    public List<Position> selectall();

    @Insert("INSERT INTO position(UserID, FutureID, Amount, EntryPrice, CurrentPrice, ProfitLoss, EntryDate, LastUpdated, ProfitLossRatio, costPrice) " +
            "VALUES(#{userId}, #{futureId}, #{amount}, #{entryPrice}, #{currentPrice}, #{profitLoss}, #{entryDate}, #{lastUpdated}, #{profitLossRatio}, #{costPrice})")
    int insertPosition(Position position);

    @Update("UPDATE position " +
            "SET UserID = #{userId}, " +
            "FutureID = #{futureId}, " +
            "Amount = #{amount}, " +
            "EntryPrice = #{entryPrice}, " +
            "CurrentPrice = #{currentPrice}, " +
            "ProfitLoss = #{profitLoss}, " +
            "EntryDate = #{entryDate}, " +
            "LastUpdated = #{lastUpdated}, " +
            "ProfitLossRatio = #{profitLossRatio}, " +
            "DeliveryDate = #{deliveryDate}, " +
            "costPrice = #{costPrice} " +
            "WHERE PositionID = #{positionId}")
    int updatePosition(Position position);


    @Select("select * from position where futureId = #{futureId} and userId = #{userId}")
    Position selectByFutureName(@Param("futureId") int currentIndex);
}