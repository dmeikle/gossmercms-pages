ALTER TABLE cms_pages
    ADD COLUMN "seoTitle" VARCHAR(255),
    ADD COLUMN "seoDescription" TEXT,
    ADD COLUMN "seoImage" VARCHAR(2048);
