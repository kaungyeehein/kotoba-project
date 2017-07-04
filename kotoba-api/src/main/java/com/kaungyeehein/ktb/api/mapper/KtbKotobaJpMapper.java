package com.kaungyeehein.ktb.api.mapper;

import com.kaungyeehein.ktb.api.domain.KtbKotobaJp;
import com.kaungyeehein.ktb.api.domain.KtbKotobaJpCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KtbKotobaJpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    long countByExample(KtbKotobaJpCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int deleteByExample(KtbKotobaJpCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int insert(KtbKotobaJp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int insertSelective(KtbKotobaJp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    List<KtbKotobaJp> selectByExampleWithRowbounds(KtbKotobaJpCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    List<KtbKotobaJp> selectByExample(KtbKotobaJpCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    KtbKotobaJp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") KtbKotobaJp record, @Param("example") KtbKotobaJpCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") KtbKotobaJp record, @Param("example") KtbKotobaJpCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(KtbKotobaJp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ktb_kotoba_jp
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(KtbKotobaJp record);
}